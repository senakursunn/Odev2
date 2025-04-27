package com.senanur.myapplication.odevler

fun main() {
    val odev = odev2()

    // 1. Celsius -> Fahrenheit
    val fahrenheit = odev.celsiusToFahrenheit(30.0)
    println("30 derece Fahrenheit karşılığı: $fahrenheit")

    // 2. Dikdörtgen Çevresi
    val cevre = odev.dikdortgenCevresi(5, 10)
    println("5 ve 10 kenarlı dikdörtgenin çevresi: $cevre")

    // 3. Faktöriyel Hesabı
    val faktoriyelSonuc = odev.faktoriyel(5)
    println("5 sayısının faktöriyeli: $faktoriyelSonuc")

    // 4. 'a' Harfi Sayısı
    val aSayisi = odev.aHarfSayisi("Ankara")
    println("'Ankara' kelimesinde 'a' harfi sayısı: $aSayisi")

    // 5. İç Açılar Toplamı
    val icAciToplam = odev.icAciToplami(5)
    println("5 kenarlı bir şeklin iç açılar toplamı: $icAciToplam derece")

    // 6. Maaş Hesabı
    val maas = odev.maasHesapla(22)
    println("22 gün çalışan bir kişinin maaşı: $maas ₺")

    // 7. Kota Ücreti
    val kotaUcret = odev.kotaUcreti(60)
    println("60 GB internet kullanan bir kişinin ödeyeceği ücret: $kotaUcret ₺")
}
