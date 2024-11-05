package com.example.memestask1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifeCycle", "On Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifeCycle", "On Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifeCycle","On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifeCycle","On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifeCycle","On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifeCycle","On Destroy")
    }

}