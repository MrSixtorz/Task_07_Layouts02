package com.example.task_07

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Linear : AppCompatActivity() {

    private lateinit var btnVolver: Button
    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var openDrawer: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        btnVolver=findViewById(R.id.btnVolver)
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView= findViewById(R.id.navigationview)
        openDrawer= findViewById(R.id.btn_open)

        openDrawer.setOnClickListener{
            if(drawerLayout.isDrawerOpen(GravityCompat.END)){
                drawerLayout.closeDrawer(GravityCompat.END)
            }
            drawerLayout.openDrawer(GravityCompat.END)
        }

        btnVolver.setOnClickListener {

            val intent= Intent(this@Linear,MainActivity::class.java)
            startActivity(intent)
        }
        navigationView = findViewById(R.id.navigationview)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.one -> {
                    val intent = Intent(this@Linear, Linear::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.two -> {
                    val intent = Intent(this@Linear, Table::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.three -> {
                    val intent = Intent(this@Linear, Relative::class.java)
                    startActivity(intent)
                    drawerLayout.closeDrawer(GravityCompat.END)
                    return@setNavigationItemSelectedListener true
                }
                R.id.four -> {
                    val intent = Intent(this@Linear, Grid::class.java)
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