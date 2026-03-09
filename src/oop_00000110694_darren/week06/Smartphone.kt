package oop_00000110694_darren.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem smartphone berhasil booting")
    }
}