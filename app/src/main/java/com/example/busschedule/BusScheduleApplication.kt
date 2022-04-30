package com.example.busschedule

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.example.busschedule.database.AppDatabase

class BusScheduleApplication: MultiDexApplication() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

}

