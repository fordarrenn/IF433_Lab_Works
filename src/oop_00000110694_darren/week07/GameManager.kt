package oop_00000110694_darren.week07

object GameManager{
    var isGameRunning: Boolean = false

    fun startGame(){
        isGameRunning = true
        println("Game started!")
    }
}