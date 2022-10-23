package com.example.homework_5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(binding.container.id,FirstFragment()).commit()
    }
}