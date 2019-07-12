package com.google.android.samples.dynamicfeatures.ondemand

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class CustomBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val passedValue = intent?.getStringExtra(EXTRA)
        Log.e(TAG, "OnReceive value $passedValue")
    }

    companion object {
        const val EXTRA = "EXTRA"
        const val TAG = "TEST_CASE"
    }
}