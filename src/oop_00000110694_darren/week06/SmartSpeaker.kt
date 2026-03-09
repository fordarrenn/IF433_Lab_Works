package oop_00000110694_darren.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name ($id) - dinyalakan")
    }

    // musik
    fun playMusic(song: String){
        println("Speaker $name ($id) memutar lagu $song")
    }

    override fun turnOff() {
        println("Speaker $name ($id) - dimatikan")
    }
}