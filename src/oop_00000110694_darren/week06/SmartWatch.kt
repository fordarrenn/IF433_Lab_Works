package oop_00000110694_darren.week06

class SmartWatch : Watch(), BluetoothConnectable, Rechargeable{
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectBluetooth() {
        println("Mencari perangkat untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan daya 15 Watt")
    }
}