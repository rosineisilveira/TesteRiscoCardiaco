package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityAgeBinding

class AgeActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityAgeBinding

    var opt  =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAge01.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnAge02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnAge03.setOnClickListener {
            opt = 3
            nextScreem()

        }

        binding.btnAge04.setOnClickListener {
            opt = 4
            nextScreem()

        }
        binding.btnAge05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnAge06.setOnClickListener {
            opt = 8
            nextScreem()
        }
    }

    private fun nextScreem(){
        val setTotal = Test(
            opt)
        val intent = Intent(this, GeneroActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)
    }
}