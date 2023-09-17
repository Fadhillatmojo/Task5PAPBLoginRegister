package com.example.pertemuan5intenttaskloginregister

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan5intenttaskloginregister.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // membuat binding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            btnRegister.setOnClickListener(){
                // membuat intent
                val intent = Intent(this@MainActivity, SecondActivity::class.java)

                // menambahkan titipan pada intent
                intent.putExtra("EXT_USERNAME", editTextUsername.text.toString())
                intent.putExtra("EXT_EMAIL", editTextEmail.text.toString())
                intent.putExtra("EXT_PHONE", editTextPhone.text.toString())

                // untuk memulai intent
                startActivity(intent)
            }
            btnLogin.setOnClickListener(){
                // untuk membuat intent
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                // untuk memulai intent
                startActivity(intent)
            }
        }
    }
}