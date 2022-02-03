package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMoveObjectBinding
import com.example.intentactivity.databinding.ActivityMoveWithResultBinding

class MoveWithResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveWithResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveWithResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val name = binding.edtEnter.text.toString()
            val intent = Intent()
            intent.putExtra("DR", name)
            setResult(200, intent)
            finish()
        }

    }
}