package com.amanaggarwal1.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amanaggarwal1.runningapp.R
import com.amanaggarwal1.runningapp.ui.viewmodels.MainViewModel
import com.amanaggarwal1.runningapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_tracking)  {

    private val viewModel: StatisticsViewModel by viewModels()
}