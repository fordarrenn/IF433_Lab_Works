package oop_00000110694_darren.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val strBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi strBox: ${strBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${math.getMax(45, 90)}")
}