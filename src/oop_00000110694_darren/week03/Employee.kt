package oop_00000110694_darren.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value){
            if(value < 0){
                println("ERROR: negative")
                field = 0
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat, rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }
}