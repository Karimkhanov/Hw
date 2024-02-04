package com.example.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw.databinding.ActivityMain2Binding
import com.example.hw.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val res = intent.getStringExtra("Name")
        binding.resultName.text = res

        val res1 = intent.getStringExtra("Surname")
        binding.resultName1.text = res1

        val res2 = intent.getStringExtra("Age")
        binding.resultName2.text = res2

        val res3 = intent.getStringExtra("Login2")
        binding.resultName3.text = res3
    }
}