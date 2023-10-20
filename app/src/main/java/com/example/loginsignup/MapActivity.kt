package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginsignup.databinding.ActivityLoginBinding
import com.example.loginsignup.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            var intent=Intent(this,StartActivity::class.java)
            startActivity(intent)
        }
        binding.logoutmapButton.setOnClickListener {
            var intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }


    }
}