package com.innovation.hiltexample.repository

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun printLog() {
        Log.d("MyApplication", "---->>> UserRepository Calling")
    }
}