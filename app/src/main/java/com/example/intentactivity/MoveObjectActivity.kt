package com.example.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMoveObjectBinding
import com.example.intentactivity.siswa.ObjectSiswa

class MoveObjectActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val siswa = intent.getParcelableExtra<ObjectSiswa>("siswa")
        if (siswa != null){
            binding.tvNama.text = siswa.nama
            binding.tvUmur.text = siswa.umur.toString()
            binding.tvGender.text = siswa.gender.toString()
            binding.tvKelas.text = siswa.kelas
            binding.tvKelulusan.text = if (siswa.lulus) "lulus" else "Belum lulus"
            binding.tvTinggi.text = siswa.tinggi.toString()

        }
    }
}