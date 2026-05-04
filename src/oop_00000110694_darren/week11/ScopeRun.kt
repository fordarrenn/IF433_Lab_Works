package oop_00000110694_darren.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama tedeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}