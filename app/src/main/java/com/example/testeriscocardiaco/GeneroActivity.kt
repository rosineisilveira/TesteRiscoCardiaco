package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityGeneroBinding

class GeneroActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityGeneroBinding

    var opt  =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGeneroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGenre01.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnGenre02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnGenre03.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnGenre04.setOnClickListener {
            opt = 4
            nextScreem()
        }
        binding.btnGenre05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnGenre06.setOnClickListener {
            opt = 7
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, WeightActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)

    }

}