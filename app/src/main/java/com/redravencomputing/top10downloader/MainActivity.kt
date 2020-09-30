package com.redravencomputing.top10downloader

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")
    }

    private inner class DownloadData : AsyncTask<String, Void, String>() {
        private val TAG = "DownloadData"

        override fun doInBackground(vararg params: String?): String {
            TODO("Not yet implemented")
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
        }
    }
}