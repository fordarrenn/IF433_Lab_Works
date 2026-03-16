package oop_00000110694_darren.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url")
    }
}