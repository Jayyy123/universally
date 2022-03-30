package com.jay.universally.presentation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import com.jay.universally.R
import com.jay.universally.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private lateinit var toggle: ActionBarDrawerToggle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        setSupportActionBar(binding.tb)
//        toggle = ActionBarDrawerToggle(this,binding.dl,binding.tb,R.string.open,R.string.close)
//        binding.dl.addDrawerListener(toggle)
//        toggle.syncState()

//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}