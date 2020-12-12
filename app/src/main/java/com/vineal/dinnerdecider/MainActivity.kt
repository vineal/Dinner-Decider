package com.vineal.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese","Ham Burger","Pizza", "Mc Donalds", "Pasta")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectedFoodTxt.text = getString(R.string.initial_food)
        decideBtn.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
        addFoodBtn.setOnClickListener(){
            val newFood = addFoodTextField.text.toString()
            foodList.add(newFood)
            addFoodTextField.text.clear()
        }

    }
}