package com.example.android_study_google.a_jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_study_google.R
import kotlinx.android.synthetic.main.activity_a__main.*

class A_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a__main)
        helloTv.apply {

        }
    }
}