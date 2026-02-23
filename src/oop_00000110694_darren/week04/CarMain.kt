package oop_00000110694_darren.week04

fun main(){
    println("=== Testing Vehicle ===")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n === Testing Car ===")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n === Testing Car ===")
    val evCar = ElectriCar("BYD", 4, 100)
    evCar.openTrunk()
    evCar.honk()
    evCar.accelerate()
}