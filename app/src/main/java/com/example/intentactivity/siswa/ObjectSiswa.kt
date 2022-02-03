package com.example.intentactivity.siswa

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ObjectSiswa (
    var nama :String,
    var umur :Int,
    var gender :Char,
    var kelas :String,
    var lulus :Boolean,
    var tinggi :Double,
) : Parcelable