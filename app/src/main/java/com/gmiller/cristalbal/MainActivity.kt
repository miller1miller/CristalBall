package com.gmiller.cristalbal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmiller.cristalbal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvPredict.setOnClickListener{
            binding.tvPredict.text = getPredict()
        }
    }
    private fun getPredict(): String{
        return resources.getStringArray(R.array.predictions)[randomNumber()]
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.predictions).size - 1
        return (0..size).random()
    }
}