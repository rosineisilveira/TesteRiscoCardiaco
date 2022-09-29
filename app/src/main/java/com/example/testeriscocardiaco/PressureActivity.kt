
package com.example.testeriscocardiaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityPressureBinding
import com.example.testeriscocardiaco.databinding.ActivitySmokeBinding

class PressureActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPressureBinding

    var opt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPressureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPressure01.setOnClickListener {
            opt = 1
            nextScreem()

        }
        binding.btnPressure02.setOnClickListener {
            opt = 2
            nextScreem()

        }
        binding.btnPressure03.setOnClickListener {
            opt = 3
            nextScreem()

        }
        binding.btnPressure04.setOnClickListener {
            opt = 4
            nextScreem()
        }
        binding.btnPressure05.setOnClickListener {
            opt = 6
            nextScreem()
        }
        binding.btnPressure06.setOnClickListener {
            opt = 8
            nextScreem()
        }
    }
    private fun nextScreem(){
        val opt_partial = intent.getParcelableExtra<Test>("setTotal")!!

        val setTotal = Test(
            (opt_partial.total?.plus(opt)))
        val intent = Intent(this, IlnesActivity::class.java)
        intent.putExtra("setTotal", setTotal)
        startActivity(intent)

    }
}