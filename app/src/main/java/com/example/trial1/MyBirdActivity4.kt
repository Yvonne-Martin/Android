package com.example.trial1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trial1.databinding.ActivityMyBird2Binding
import com.example.trial1.databinding.ActivityMyBird4Binding
import com.squareup.picasso.Picasso

class MyBirdActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMyBird4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMyBird4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var btnNext = findViewById<ImageView>(R.id.imageView12)
        btnNext.setOnClickListener {
            finish()
        }
        Picasso.get().load("").into(binding.imageView11)
    }
}