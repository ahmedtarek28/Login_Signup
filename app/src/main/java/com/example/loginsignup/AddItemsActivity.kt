package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginsignup.databinding.ActivityAddItemsBinding
import com.example.loginsignup.databinding.ActivityStartBinding

class AddItemsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            var intent= Intent(this,StartActivity::class.java)
            startActivity(intent)
        }
        binding.logoutButton.setOnClickListener {
            var intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

    }
}