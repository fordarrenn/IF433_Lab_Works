package oop_00000110694_darren.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu, dibuka!")
    }

    override fun honk(){
        println("WIT WIT! Mobil $brand lewat!")
    }

    override fun accelerate(){
        super.accelerate()
        println("Mobil $brand menggunakan transmisi untuk menambah kecepatan")
    }
}