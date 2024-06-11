package com.example.trial1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trial1.databinding.ActivityMyBird2Binding
import com.squareup.picasso.Picasso

class MyBirdActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMyBird2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyBird2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView6.setOnClickListener {
            finish()
        }

            binding.imageView6.setOnClickListener {
            val intent= Intent (this,MyBirdActivity3::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/474x/7d/72/2d/7d722da8cbcb202f91056bd09ae4ecd0.jpg").into(binding.imageView3)
    }
}