package com.example.task_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var openDrawer: Button
    private lateinit var Menu: EditText
    private lateinit var btnLinear: Button
    private lateinit var btnTable: Button
    private lateinit var btnRelative: Button
    private lateinit var btnGrid: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView= findViewById(R.id.navigationview)
        openDrawer= findViewById(R.id.btn_open)

        openDrawer.setOnClickListener{
            if(drawerLayout.isDrawerOpen(GravityCompat.END)){
                drawerLayout.closeDrawer(GravityCompat.END)
            }
            drawerLayout.openDrawer(GravityCompat.END)
        }

        btnLinear=findViewById(R.id.btnLinear)
        btnTable=findViewById(R.id.btnTable)
        btnRelative=findViewById(R.id.btnRelative)
        btnGrid=findViewById(R.id.btnGrid)


        btnLinear.setOnClickListener {

            val intent= Intent(this@MainActivity,Linear::class.java)
            startActivity(intent)
        }
        btnTable.setOnClickListener {

            val intent= Intent(this@MainActivity,Table::class.java)
            startActivity(intent)
        }
        btnRelative.setOnClickListener {

            val intent= Intent(this@MainActivity,Relative::class.java)
            startActivity(intent)
        }
        btnGrid.setOnClickListener {

            val intent= Intent(this@MainActivity,Grid::class.java)
            startActivity(intent)
        }
        navigationView = findViewById(R.id.navigationview)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.one -> {
                    val intent = Intent(this@MainActivity, Linear::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.two -> {
                    val intent = Intent(this@MainActivity, Table::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.three -> {
                    val intent = Intent(this@MainActivity, Relative::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.four -> {
                    val intent = Intent(this@MainActivity, Grid::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                else -> {
                    return@setNavigationItemSelectedListener false
                }
            }
        }

    }
}