package oop_00000110694_darren.week01

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

fun main() {
    val radius = 7.0
    val pi = 3.14

    var area: Double = radius * pi

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}