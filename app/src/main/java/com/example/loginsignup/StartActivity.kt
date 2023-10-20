package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.loginsignup.databinding.ActivityMapBinding
import com.example.loginsignup.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mapButton.setOnClickListener {
            var intent=Intent(this,MapActivity::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.logoutmapButton.setOnClickListener {
            var intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        binding.additemsButton.setOnClickListener {
            var intent=Intent(this,AddItemsActivity::class.java)
            startActivity(intent)
        }

    }


}