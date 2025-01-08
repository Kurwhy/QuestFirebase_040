package com.example.praktikum_pertemuan14

import android.app.Application
import com.example.praktikum_pertemuan14.di.MahasiswaContainer

class MahasiswaApp: Application() {
    lateinit var container: MahasiswaContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}