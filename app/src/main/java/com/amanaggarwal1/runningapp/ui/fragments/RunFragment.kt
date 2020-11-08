package com.amanaggarwal1.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amanaggarwal1.runningapp.R
import com.amanaggarwal1.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment: Fragment(R.layout.fragment_run)  {

    private val viewModel: MainViewModel by viewModels()
}