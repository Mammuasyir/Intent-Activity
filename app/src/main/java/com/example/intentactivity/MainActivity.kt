package com.example.intentactivity

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Display
import com.example.intentactivity.databinding.ActivityMainBinding
import com.example.intentactivity.siswa.ObjectSiswa

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val tag = "Cari"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(tag, "onCreate")

        binding.btnMove.setOnClickListener {
            startActivity(Intent(this, MoveActivity::class.java))
        }

        binding.btnMoveData.setOnClickListener {
            val intent = Intent(this, MoveDataActivity::class.java)
            intent.putExtra("nama", "Bambang")
            intent.putExtra("umur", 20)
            intent.putExtra("tinggi", 172.3)
            startActivity(intent)
        }

        binding.btnMoveObject.setOnClickListener {
            val siswa = ObjectSiswa("Tio", 50, 'L', "A2", lulus = true, 123.7)
            val intent = Intent(this, MoveObjectActivity::class.java)
            intent.putExtra("siswa", siswa)
            startActivity(intent)
        }

        binding.btnMoveWithResult.setOnClickListener {
            val i = Intent(this, MoveWithResultActivity::class.java)
            startActivityForResult(i, 100)
        }

        binding.btnMoveToApp.setOnClickListener {
            val telp = "08977473885"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$telp")
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100) {
            if (resultCode == 200){
                val name = data?.getStringExtra("DR")
                binding.tvHasil.text = name
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "OnDestroy")
    }

}