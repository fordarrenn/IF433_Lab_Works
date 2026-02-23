package oop_00000110694_darren.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int {
        return baseSalary + 500000
    }
}