package com.example.intentactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMoveDataBinding

class MoveDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val umur = intent.getIntExtra("umur", 0)
        val tinggi = intent.getDoubleExtra("tinggi", 0.0)

        binding.tvNama.text = nama
        binding.tvUmur.text = umur.toString()
        binding.tvTinggi.text = tinggi.toString()
    }
}