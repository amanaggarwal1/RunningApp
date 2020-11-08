package com.amanaggarwal1.runningapp.repository

import com.amanaggarwal1.runningapp.db.Run
import com.amanaggarwal1.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
){

    suspend fun insertRun(run: Run) = runDao.insertRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()
    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()
    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByAverageSpeed() = runDao.getAllRunsSortedByAverageSpeed()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
    fun getTotalDistanceInMeters() = runDao.getTotalDistanceInMeters()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getAverageSpeed() = runDao.getAverageSpeed()
    fun getAverageDistanceInMeters() = runDao.getAverageDistanceInMeters()
    fun getAverageTimeInMillis() = runDao.getAverageTimeInMillis()
    fun getAverageCaloriesBurned() = runDao.getAverageCaloriesBurned()

}