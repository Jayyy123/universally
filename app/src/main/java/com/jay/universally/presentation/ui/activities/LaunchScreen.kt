package com.jay.universally.presentation.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.jay.universally.R
import com.jay.universally.databinding.ActivityLaunchScreenBinding
import com.jay.universally.databinding.ActivityMainBinding

private lateinit var binding: ActivityLaunchScreenBinding
private lateinit var handler: Handler

@SuppressLint("CustomSplashScreen")
class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLaunchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler()

        binding.fab.setOnClickListener {

            it.visibility = View.INVISIBLE

            binding.arr.visibility = View.INVISIBLE

            binding.plane.visibility = View.VISIBLE
            binding.blank.visibility = View.VISIBLE

            binding.animla.animate().translationY(-2500f).duration = 2500
            binding.plane.animate().translationY(-2500f).duration = 2500

            handler.postDelayed({
                handler.postDelayed({
                    startActivity(Intent(this,MainActivity::class.java))
                },100)
            },2300)




        }

    }
}