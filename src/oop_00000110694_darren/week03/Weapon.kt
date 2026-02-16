package oop_00000110694_darren.week03

class Weapon(val name: String){
    var damage: Int = 0
        set(value){
            if (value < 0){
                println("ERR: Damage below 0!")
                field = 0
            } else if(value > 1000) {
                println("ERR: Damage above 1000!")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = when{
            damage > 800 -> "The $name is Legendary!"
            damage > 500 -> "The $name is Epic!"
            else -> "The $name is Common!"
        }
}
