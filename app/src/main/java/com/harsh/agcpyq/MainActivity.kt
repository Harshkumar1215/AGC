package com.harsh.agcpyq

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val btnHome = findViewById<LinearLayout>(R.id.btn_home)
        val btnPyq = findViewById<LinearLayout>(R.id.btn_pyq)
        val btnNotification = findViewById<LinearLayout>(R.id.btn_notification)
        val btnAbout = findViewById<LinearLayout>(R.id.btn_about)

        // Load default fragment
        loadFragment(HomeFragment())

        btnHome.setOnClickListener { loadFragment(HomeFragment()) }
        btnPyq.setOnClickListener { loadFragment(PyqFragment()) }
        btnNotification.setOnClickListener { loadFragment(NotificationFragment()) }
        btnAbout.setOnClickListener { loadFragment(AboutFragment()) }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}