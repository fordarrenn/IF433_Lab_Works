package oop_00000110694_darren.week04

class ElectriCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors){
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi.\nKapasitas baterai: $batteryCapacity%")
    }
}