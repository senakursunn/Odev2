package com.senanur.myapplication.odevler

class odev2 {

    // 1. Dereceyi fahrenheit'a çeviren metod
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // 2. Dikdörtgen çevresi hesaplayan metod
    fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
        return 2 * (kisaKenar + uzunKenar)
    }

    // 3. Faktöriyel hesaplayan metod
    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    // 4. Kelimede 'a' harfi sayan metod
    fun aHarfSayisi(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }

    // 5. İç açılar toplamı hesaplayan metod
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    // 6. Maaş hesabı yapan metod
    fun maasHesapla(gunSayisi: Int): Int{
        val saatlikUcret = 10
        val mesaiUcreti = 20
        val calismaSaat = gunSayisi * 8

        return if(calismaSaat > 160){
            val mesaiSaat = calismaSaat - 160
            (160 * saatlikUcret) + (mesaiSaat * mesaiUcreti)
        }else{
            calismaSaat * saatlikUcret
        }
    }
    // 7. Kota ücreti hesaplayan metod
    fun kotaUcreti(kotaMiktari: Int): Int{
        return if (kotaMiktari <= 50){
            100
        }else{
            100 + (kotaMiktari - 50) * 4
        }
    }

}