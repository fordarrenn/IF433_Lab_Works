package oop_00000110694_darren.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            println("mencoba set gaji ke $salary")
            this.salary = value
        }
}