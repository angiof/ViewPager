package com.example.viewpager.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager.R

class IntroSlpach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_slpach)


        Handler().postDelayed({
            if (requireStatusIntro()){
            startActivity(Intent(this, HomeActivity::class.java))

            }else{

            startActivity(Intent(this, MainActivity::class.java))
            }

        }, 1000)

    }

    private fun requireStatusIntro(): Boolean {
        val sharedPreferences = this.getSharedPreferences("", Context.MODE_PRIVATE)

        return sharedPreferences.getBoolean("finito", false)
    }
}