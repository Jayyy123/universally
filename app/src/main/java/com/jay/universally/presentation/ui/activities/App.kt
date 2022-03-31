package com.jay.universally.presentation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.jay.universally.R
import com.jay.universally.databinding.ActivityAppBinding

class App : AppCompatActivity() {

    private lateinit var binding: ActivityAppBinding
    private lateinit var navController: NavController
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.tb)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHost.navController

        binding.bnv.setupWithNavController(navController)

        toggle = ActionBarDrawerToggle(this,binding.dl,binding.tb,R.string.open,R.string.close)

        binding.dl.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


    }
}