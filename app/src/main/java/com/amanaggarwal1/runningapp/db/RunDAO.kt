package com.amanaggarwal1.runningapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    /**
     * Queries for getting all runs sorted by different parameters
     */
    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY averageSpeedInKMPH DESC")
    fun getAllRunsSortedByAverageSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    /**
     * Queries for getting sum of compiled data
     */

    @Query("SELECT SUM(timeInMillis) from running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(distanceInMeters) from running_table")
    fun getTotalDistanceInMeters(): LiveData<Int>

    @Query("SELECT SUM(caloriesBurned) from running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    /**
     * Queries for getting average data from compiled data
     */

    @Query("SELECT AVG(timeInMillis) from running_table")
    fun getAverageTimeInMillis(): LiveData<Long>

    @Query("SELECT AVG(distanceInMeters) from running_table")
    fun getAverageDistanceInMeters(): LiveData<Int>

    @Query("SELECT AVG(caloriesBurned) from running_table")
    fun getAverageCaloriesBurned(): LiveData<Int>

    @Query("SELECT AVG(averageSpeedInKMPH) from running_table")
    fun getAverageSpeed(): LiveData<Float>

}