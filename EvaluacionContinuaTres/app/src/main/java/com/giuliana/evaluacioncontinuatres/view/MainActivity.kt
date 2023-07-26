package com.giuliana.evaluacioncontinuatres.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.giuliana.evaluacioncontinuatres.R
import com.giuliana.evaluacioncontinuatres.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHeadFragment=supportFragmentManager.findFragmentById(R.id.fcv_rickimorti) as NavHostFragment
        val navController=navHeadFragment.navController
        binding.bnvMenu.setupWithNavController(navController)
    }
}