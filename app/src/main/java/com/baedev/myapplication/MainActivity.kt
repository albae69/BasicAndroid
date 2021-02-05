package com.baedev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miSettings -> Toast.makeText(this, "Settings touched", Toast.LENGTH_SHORT).show()
            R.id.miFavorite -> Toast.makeText(this, "Favorite touched", Toast.LENGTH_SHORT).show()
            R.id.miExit -> finish()
        }
        return true
    }

}