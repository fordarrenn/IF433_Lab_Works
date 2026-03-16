package oop_00000110694_darren.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to server"
        println("Database is ready")
    }
}