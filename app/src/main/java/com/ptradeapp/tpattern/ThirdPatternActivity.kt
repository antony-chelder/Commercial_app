package com.ptradeapp.tpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ptradeapp.tpattern.databinding.ActivityThanksBinding

class ThirdPatternActivity : AppCompatActivity() {
   private lateinit var binding : ActivityThanksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThanksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getMyIntent()
    }
    fun getMyIntent(){
        val i = intent
       binding.userName.text = i.getStringExtra("Name")
        binding.userSurname.text = i.getStringExtra("Second")

    }
}