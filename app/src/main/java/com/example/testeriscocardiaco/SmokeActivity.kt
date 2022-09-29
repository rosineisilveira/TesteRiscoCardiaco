package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivitySmokeBinding

class SmokeActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySmokeBinding

    var opt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmokeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSmoke01.setOnClickListener {
            opt =0
            nextScreem()

        }
        binding.btnSmoke02.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnSmoke03.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnSmoke04.setOnClickListener {
            opt = 4
            nextScreem()
        }
        binding.btnSmoke05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnSmoke06.setOnClickListener {
            opt = 10
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, PressureActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)
    }
}