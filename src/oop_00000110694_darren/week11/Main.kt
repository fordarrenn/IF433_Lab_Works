package oop_00000110694_darren.week11

fun main(){
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeat(3))

    val text: String? = null
    println("Apakah null? ${text.isNullOrEmptyCustom()}")
}