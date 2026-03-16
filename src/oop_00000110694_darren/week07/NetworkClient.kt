package oop_00000110694_darren.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id/"

        fun createClient() : NetworkClient {
            println("Creating client $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }
    fun connect(){
        println("Connecting to $url")
    }
}