package oop_00000110694_darren.week07

fun main(){
    println("Database Manager Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    val client = NetworkClient.createClient()
    client.connect()
}