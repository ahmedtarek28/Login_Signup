package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.CheckBox
import android.widget.Toast
import com.example.loginsignup.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth=FirebaseAuth.getInstance()

        binding.loginButton.setOnClickListener{
            val email=binding.loginEmail.text.toString()
            val password=binding.loginPassword .text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent=Intent(this,StartActivity::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this,"Incorrect mail or password",Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(this,"Fields can not be empty",Toast.LENGTH_SHORT).show()
            }
        }
        binding.signupuserButton.setOnClickListener {
            val signupIntent=Intent(this,SignupActivity::class.java)
            startActivity(signupIntent)
        }
    }

}