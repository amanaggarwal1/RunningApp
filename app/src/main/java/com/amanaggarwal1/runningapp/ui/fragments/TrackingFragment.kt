package com.amanaggarwal1.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amanaggarwal1.runningapp.R
import com.amanaggarwal1.runningapp.ui.viewmodels.MainViewModel
import com.google.android.gms.maps.GoogleMap
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_tracking.*

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking)  {

    private val viewModel: MainViewModel by viewModels()

    private var googleMap : GoogleMap? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView.onCreate(savedInstanceState)

        mapView.getMapAsync{
            googleMap = it
        }
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mapView.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }
}