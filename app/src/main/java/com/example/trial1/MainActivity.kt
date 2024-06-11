package com.example.trial1

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trial1.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this,MyBirdActivity1::class.java)
            startActivity(intent)

        }
        Picasso
            .get()
            .load("https://i.pinimg.com/564x/2b/77/51/2b77515c4cd2ec5b6119080d05b1e68e.jpg")
            .into(binding.imageView)

        }
        }


