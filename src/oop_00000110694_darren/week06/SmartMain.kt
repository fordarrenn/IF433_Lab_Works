package oop_00000110694_darren.week06

fun main(){
    val lamp = SmartLamp("113", "Ruang Tamu")
    val speaker = SmartSpeaker("771", "Google Nest Dapur")
    val cctv = SmartCCTV("115", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}