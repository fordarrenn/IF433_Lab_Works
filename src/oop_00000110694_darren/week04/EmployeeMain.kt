package oop_00000110694_darren.week04

fun main(){
    val e1 = "Vladimir Kyorechi"
    val e2 = "Dmitry Lenov"

    println("=== EMPLOYEE INFO ===")
    println("\nEMPLOYEE TYPE: Manager")
    val manager = Manager(e1, 15000000)
    manager.work()
    manager.calculateBonus()

    println("\n=== EMPLOYEE INFO ===")
    println("\nEMPLOYEE TYPE: Developer")
    val developer = Developer(e2, 7000000, "Assembler")
    developer.work()
    developer.calculateBonus()
}