package oop_00000110694_darren.week03

class Player(val username: String){
    private var xp: Int = 0
    val level: Int
        get() = xp / 100 + 1

    fun addXp(amount: Int){
        if(amount >= 0){
            val currLevel = level
            xp += amount
            val newLevel = level

            if(newLevel > currLevel){
                println("Level Up! $level")
            }
        } else {
            return
        }
    }
}