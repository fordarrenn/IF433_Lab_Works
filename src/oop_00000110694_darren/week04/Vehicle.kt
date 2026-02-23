package oop_00000110694_darren.week04

open class Vehicle(val brand: String){
    var speed : Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed")
    }

    open fun honk(){
        println("Beep beep!")
    }
}