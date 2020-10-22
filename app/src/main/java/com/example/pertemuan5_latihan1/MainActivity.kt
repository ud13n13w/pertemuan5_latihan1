package com.example.pertemuan5_latihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v_imgbtnback = findViewById<ImageButton>(R.id.imgbtn_back)
        v_imgbtnback.setOnClickListener {
            Toast.makeText(this@MainActivity, "Back", Toast.LENGTH_LONG).show()
        }

        val v_btnsignup = findViewById<Button>(R.id.btn_signup)
        v_btnsignup.setOnClickListener {
            Toast.makeText(this@MainActivity, "Sign Up Success !", Toast.LENGTH_LONG).show()
        }

    }
}