package com.example.trial1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trial1.databinding.ActivityMyBird2Binding
import com.example.trial1.databinding.ActivityMyBird3Binding
import com.squareup.picasso.Picasso

class MyBirdActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMyBird3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMyBird3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView10.setOnClickListener {
            finish()
        }
            binding.imageView9.setOnClickListener {
            val intent= Intent (this,MyBirdActivity4::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/564x/c0/f7/77/c0f7770f01ac2c5903dc3012764aadd8.jpg").into(binding.imageView2)
    }
}