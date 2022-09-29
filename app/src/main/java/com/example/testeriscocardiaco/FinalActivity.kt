package com.example.testeriscocardiaco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeriscocardiaco.databinding.ActivityFinalBinding
import com.example.testeriscocardiaco.databinding.ActivityMainBinding

class FinalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val setTotal = intent.getParcelableExtra<Test>("setTotal")



        binding.textResult.text = setTotal?.total.toString()





    }
}