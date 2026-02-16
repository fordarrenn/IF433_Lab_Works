package oop_00000110694_darren.week02

class Hero(
    val heroName: String,
    var hp: Int = 100,
    val baseDamage: Int
){
    fun attack(targetName: String){
        println("$heroName memukul $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if(hp <= 0){
            hp = 0
        }
    }

    fun isAlive() : Boolean {
        return hp > 0
    }
}