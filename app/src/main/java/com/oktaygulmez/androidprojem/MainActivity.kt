package com.oktaygulmez.androidprojem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hesapla(view : View){
        val yakitort = yakitortText.text.toString().toInt()
        val km = kmText.text.toString().toInt()
        val yakitfiyat = yakitFiyatText.text.toString().toInt()
        var sonuc = (yakitort*(km/100)*yakitfiyat)
        var kmkacyakar = sonuc/km
        sonucText.text = "Aracınız Toplamda " + sonuc.toString()+" liralık yakıt yakacaktır."
        kmKacYakarText.text = "Aracınız km başına " + kmkacyakar + " lira yakacaktır. "
    }
}