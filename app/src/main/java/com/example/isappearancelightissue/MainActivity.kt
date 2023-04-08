package com.example.isappearancelightissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.switchModeDay)
            .setOnClickListener {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        findViewById<Button>(R.id.switchModeNight)
            .setOnClickListener {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        findViewById<Button>(R.id.switchBarsLight)
            .setOnClickListener {
                WindowInsetsControllerCompat(window, window.decorView)
                    .isAppearanceLightStatusBars = true
                WindowInsetsControllerCompat(window, window.decorView)
                    .isAppearanceLightNavigationBars = true
            }
        findViewById<Button>(R.id.switchBarsDark)
            .setOnClickListener {
                WindowInsetsControllerCompat(window, window.decorView)
                    .isAppearanceLightStatusBars = false
                WindowInsetsControllerCompat(window, window.decorView)
                    .isAppearanceLightNavigationBars = false
            }
    }
}
