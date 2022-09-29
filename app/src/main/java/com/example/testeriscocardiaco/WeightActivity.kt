package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityGeneroBinding
import com.example.testeriscocardiaco.databinding.ActivityWeightBinding

class WeightActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityWeightBinding

    var opt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnW01.setOnClickListener{
            opt = 0
            nextScreem()

        }
        binding.btnW02.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnW03.setOnClickListener {
            opt = 2
            nextScreem()

        }

        binding.btnW04.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnW05.setOnClickListener {
            opt = 5
            nextScreem()
        }
        binding.btnW06.setOnClickListener {
            opt = 7
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, ActivityActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)


    }
}