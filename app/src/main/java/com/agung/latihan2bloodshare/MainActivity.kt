package com.agung.latihan2bloodshare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.agung.latihan2bloodshare.databinding.ActivityMainBinding

/**
 *
 * =========================================================================================
 * This project was created to fulfill the assignment of Mobile Computing Application course.
 *
 *                              Universitas Komputer Indonesia
 * =========================================================================================
 *
 * Author's Information
 * ==========================
 * NIM      : 10118902
 * Name     : Agung Sepruloh
 * Class    : IF-11
 * Informatics Engineering
 * ==========================
 * Created on  27 Apr 2021
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }
}