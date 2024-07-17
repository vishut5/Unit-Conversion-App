package com.vishu.unitconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Delay for 3 seconds
        Thread.sleep(3000)

        // Start MainActivity after 3 seconds
        startActivity(Intent(this, MainActivity::class.java))
        finish() // Finish the splash activity
    }
}


