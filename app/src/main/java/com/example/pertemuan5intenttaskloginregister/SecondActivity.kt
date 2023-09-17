package com.example.pertemuan5intenttaskloginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan5intenttaskloginregister.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataIntent = intent

        val username = dataIntent.getStringExtra("EXT_USERNAME")
        val email = dataIntent.getStringExtra("EXT_EMAIL")
        val phone = dataIntent.getStringExtra("EXT_PHONE")

        with(binding){
            // membuat text view yang baru
            val email_view = "Your "+ email +  " has been activated"
            val phone_view = "Your "+ phone +  " has been registered"
            textViewUsername.text = username
            textViewEmail.text = email_view
            textViewPhone.text = phone_view

        }
    }
}