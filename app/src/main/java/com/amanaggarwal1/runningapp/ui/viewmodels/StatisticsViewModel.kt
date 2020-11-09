package com.amanaggarwal1.runningapp.ui.viewmodels


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.amanaggarwal1.runningapp.repository.MainRepository
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
): ViewModel() {

    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistanceInMeters()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = mainRepository.getAverageSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}