package oop_00000110694_darren.week04

open class Employee(val name: String, val baseSalary: Int){
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Int {
        val bonusDouble = baseSalary * 0.1
        val bonusInt = bonusDouble.toInt()
        return bonusInt
    }
}