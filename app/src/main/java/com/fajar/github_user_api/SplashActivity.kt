package com.fajar.github_user_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fajar.github_user_api.databinding.ActivitySplashBinding
import com.fajar.github_user_api.ui.main.MainActivity
import com.fajar.github_user_api.util.Constanta.TIME_SPLASH

class SplashActivity : AppCompatActivity() {

    private lateinit var splashBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        val handler = Handler(mainLooper)

        handler.postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, TIME_SPLASH)


        supportActionBar?.hide()
    }
}