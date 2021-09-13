package com.gap.lib1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class Lib1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib1)
    }
}