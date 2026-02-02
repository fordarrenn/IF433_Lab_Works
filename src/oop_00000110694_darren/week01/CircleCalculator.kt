package oop_00000110694_darren.week01

fun checkSize(area: Double){
    if(area > 100){
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    var area: Double = radius * pi

    println("Radius: $radius, Area: $area")
    checkSize(area)
}