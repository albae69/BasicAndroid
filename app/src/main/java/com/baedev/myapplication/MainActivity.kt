package com.baedev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            var food = rgFood.checkedRadioButtonId
            var selected = findViewById<RadioButton>(food)
            var cheese = cbCheese.isChecked
            var onions = cbOnions.isChecked
            var sauce = cbSauce.isChecked

            var orderedBurger = "You order a burger with: \n" +
                    "${selected.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (sauce) "\nSauce" else "")

            tvOrder.text = orderedBurger
        }

    }
}