package com.example.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.loginsignup.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySignupBinding
    private lateinit var firebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth=FirebaseAuth.getInstance()

        binding.signupButton.setOnClickListener {
            val email=binding.signupEmail.text.toString()
            val password=binding.signupPassword.text.toString()
            val confirmPassword=binding.signupConfirm.text.toString()

            if(email.isNotEmpty() &&password.isNotEmpty() &&confirmPassword.isNotEmpty()){
                if(password==confirmPassword){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{
                        if(it.isSuccessful){
                            val intent= Intent(this,LoginActivity::class.java)
                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else {
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this,"Fields can not be Empty",Toast.LENGTH_SHORT).show()
            }
        }
        binding.signinuserButton.setOnClickListener {
             val loginIntent=Intent(this,LoginActivity::class.java)
            startActivity(loginIntent)
        }
    }



}