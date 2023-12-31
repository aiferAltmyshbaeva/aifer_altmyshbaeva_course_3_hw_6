package com.example.c3lesson6hw6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.c3lesson6hw6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_poster, PosterFragment())
            .addToBackStack(null).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_playlist, PlayListFragment())
            .addToBackStack(null).commit()
    }
}