package oop_00000110694_darren.week03

fun main(){
    val player = Player("Sun Yat-Sen")
    val weapon = Weapon("Three Principles of the People")

    println("===TEST ERROR===")
    // println("XP: ${player.xp}")

    player.addXp(50)
    player.addXp(60)

    weapon.damage = 100
    println(weapon.tier)
}