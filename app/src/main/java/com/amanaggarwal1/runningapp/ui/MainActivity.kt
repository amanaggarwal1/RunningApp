package com.amanaggarwal1.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.amanaggarwal1.runningapp.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())

        navHostFragment.findNavController()
                .addOnDestinationChangedListener{ _, destination, _ ->
                    when(destination.id){
                        R.id.runFragment, R.id.statisticsFragment, R.id.settingsFragment ->
                            bottomNavigationView.visibility = View.VISIBLE
                        else ->
                            bottomNavigationView.visibility = View.GONE
                    }
        }
    }
}