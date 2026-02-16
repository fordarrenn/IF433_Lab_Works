package oop_00000110694_darren.week03

fun main(){
    val e = Employee("Budi")

    println("===TEST===")
    e.salary = -1000
    e.salary = 50000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak: ${e.tax}")
}