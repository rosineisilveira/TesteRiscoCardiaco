package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityCholesterolMainBinding

class CholesterolMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCholesterolMainBinding

     var opt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCholesterolMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCholesterol01.setOnClickListener {
            opt =1
            nextScreem()

        }
        binding.btnCholesterol02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnCholesterol03.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnCholesterol04.setOnClickListener {
            opt = 4
            nextScreem()
        }
        binding.btnCholesterol05.setOnClickListener {
            opt = 5
            nextScreem()
        }
        binding.btnCholesterol06.setOnClickListener {
            opt = 7
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, FinalActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)
    }
}