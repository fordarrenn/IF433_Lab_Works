package oop_00000110694_darren.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000){
        price - (price * 20/100)
    } else {
        price - (price * 10/100)
    }

fun main(){
    val gameTitle = "Heartopia"
    val price = 900000
}