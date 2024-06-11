package com.example.trial1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trial1.databinding.ActivityMyBird1Binding
import com.squareup.picasso.Picasso

class MyBirdActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMyBird1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMyBird1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView7.setOnClickListener {
            finish()

        }

        binding.imageView5.setOnClickListener {
            val intent= Intent (this,MyBirdActivity1::class.java)
            startActivity(intent)
        }
        Picasso
            .get().
            load("https://i.pinimg.com/564x/a7/db/c1/a7dbc10821153292e86a6036ec6f6fb7.jpg")
                .into(binding.imageView4)

    }

}