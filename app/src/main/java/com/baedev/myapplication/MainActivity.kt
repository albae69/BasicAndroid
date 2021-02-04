package com.baedev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                val name = etName.text.toString()
                val age = etAge.text.toString().toInt()
                val country = etCountry.text.toString()
//
//                it.putExtra("EXTRA_NAME", name)
//                it.putExtra("EXTRA_AGE", age)
//                it.putExtra("EXTRA_COUNTRY", country)


                val person = Person(name,age,country)
                it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }
        }
    }
}