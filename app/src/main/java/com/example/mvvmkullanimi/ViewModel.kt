package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var sonuc = MutableLiveData<String>()
    init {
        sonuc = MutableLiveData<String>("0")
    }
    fun toplamaYap(alinanSayi1:String,alinanSayi2:String) {

        //Tam sayiya donusturme
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        sonuc.value = toplam.toString()


    }
    fun carpmaYap(alinanSayi1:String,alinanSayi2:String) {

        //Tam sayiya donusturme
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 * sayi2
        sonuc.value = toplam.toString()


    }


}