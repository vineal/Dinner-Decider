package com.vineal.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectedFoodTxt.text = "Burger King"
        addFoodBtn.setOnClickListener(){
            selectedFoodTxt.text = addFoodTextField.text
        }
    }
}