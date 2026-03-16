package oop_00000110694_darren.week07

fun main(){
    println("\n TEST REGULAR CLASS\n")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")
}