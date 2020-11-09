package com.amanaggarwal1.runningapp.other

import android.Manifest
import android.content.Context
import android.os.Build
import pub.devrel.easypermissions.EasyPermissions
import java.util.concurrent.TimeUnit

object TrackingUtility {

    fun hasLocationPermission(context: Context) =
            if(Build.VERSION.SDK_INT < Build.VERSION_CODES.Q){
                EasyPermissions.hasPermissions(
                        context,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                )
            }else{
                EasyPermissions.hasPermissions(
                        context,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_BACKGROUND_LOCATION
                )
            }

    fun getFormattedStopWatchTime(ms: Long, includeMillis: Boolean = false) : String{
        var milliSeconds = ms

        val hours = TimeUnit.MILLISECONDS.toHours(milliSeconds)
        milliSeconds -= TimeUnit.HOURS.toMillis(hours)

        val minutes = TimeUnit.MILLISECONDS.toMinutes(milliSeconds)
        milliSeconds -= TimeUnit.MINUTES.toMillis(minutes)

        val seconds = TimeUnit.MILLISECONDS.toSeconds(milliSeconds)
        milliSeconds = TimeUnit.SECONDS.toMillis(seconds)

        val time = "${if(hours < 10) "0" else ""}$hours:" +
                "${if(minutes < 10) "0" else ""}$minutes:" +
                "${if(seconds < 10) "0" else ""}$seconds"

        if(!includeMillis){
            return time
        }else{
            return time +
                    ".${if(milliSeconds < 10) "00" else if(milliSeconds < 100) "0" else ""}$milliSeconds"
        }
    }
}