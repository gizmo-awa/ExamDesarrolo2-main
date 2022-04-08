package com.lharo.exam

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myBtnMovie = findViewById<Button>(R.id.button_ToMovies)
        myBtnMovie.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when(view.id){
            R.id.button_ToMovies ->Intent(this, MoviesActivity::class.java)
            else -> throw IllegalArgumentException("Invalid Button")
        }

        startActivity(intent)
    }
}