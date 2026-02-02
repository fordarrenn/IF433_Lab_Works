package oop_00000110694_darren.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000){
        price - (price * 20/100)
    } else {
        price - (price * 10/100)
    }
fun printReceipt(title: String, finalPrice: Int){
    println("Title: $title, Real Price: $finalPrice, Discount Price: ${calculateDiscount(finalPrice)}")
}

fun main(){
    val gameTitle = "Heartopia"
    val price = 900000
}