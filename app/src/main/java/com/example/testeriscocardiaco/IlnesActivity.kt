package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityIlnesBinding

class IlnesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIlnesBinding

    var opt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIlnesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIllnes01.setOnClickListener {
            opt =1
            nextScreem()

        }
        binding.btnIllnes02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnIllnes03.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnIllnes04.setOnClickListener {
            opt = 4
            nextScreem()
        }
        binding.btnIllnes05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnIllnes06.setOnClickListener {
            opt = 7
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, CholesterolMainActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)
    }
}