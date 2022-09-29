package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityActivityBinding

class ActivityActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityActivityBinding

    var opt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivity01.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnActivity02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnActivity03.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnActivity04.setOnClickListener {
            opt = 5
            nextScreem()
        }
        binding.btnActivity05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnActivity06.setOnClickListener {
            opt = 8
            nextScreem()
        }
    }

    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, SmokeActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)

    }
}