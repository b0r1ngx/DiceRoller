package com.b0r1ngx.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.b0r1ngx.diceroller.databinding.ActivityMainBinding
//at start 15:24 - 93%, power saver, brightness - 50%
//at end ??
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val rollButton = binding.buttonRoll
//        rollButton.text = "Lets Roll"
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val buttonRoll = binding.buttonRoll
        buttonRoll.text = "Lets Roll"
    }
}