package com.c22_054.apploker.ui.succesplay

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.c22_054.apploker.R
import com.c22_054.apploker.ui.login.LoginActivity

class SuccesPlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SuccesPlayActivity, LoginActivity::class.java))
            finish()

        },3000)
    }
}