package com.dj.ksp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dj.app.R
import com.dj.ksp.annotation.TestAnnotation

class MainActivity : AppCompatActivity() {
    @TestAnnotation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}