package com.example.uas_ferdericoadham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ShowDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)
        val defaultValue = "Error"
        val imagur = intent.getIntExtra("daImg",0)
        val zname1 = intent.getStringExtra("daName") ?: defaultValue
        val zdesc1 = intent.getStringExtra("daDesc") ?: defaultValue
        val imagez = findViewById<ImageView>(R.id.imageView)
        val name = findViewById<TextView>(R.id.detailName)
        val desc = findViewById<TextView>(R.id.detailDescription)
        imagez.setImageResource(imagur)
        name.text = zname1
        desc.text = zdesc1
    }
}