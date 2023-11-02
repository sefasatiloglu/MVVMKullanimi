package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.example.mvvmkullanimi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    private val viewModel: com.example.mvvmkullanimi.ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim= DataBindingUtil.setContentView(this,R.layout.activity_main)

        tasarim.mainActivityNesnesi = this


        viewModel.sonuc.observe(this,{it ->
            tasarim.hesapalamaSonucu = it
        })


    }
    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String) {
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)

    }
    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String) {
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)

    }
}