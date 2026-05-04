package oop_00000110694_darren.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
    }
    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera tehubung")
        homeDevices.add(it)
    }

    val ac = run {
        SmartDevice("Daikin Inverter", "HVAC", false, 800)
    }
    homeDevices.add(ac)
    val feeder = run {
        SmartDevice("Picolo", "Pet Care", true, 10)
    }
    homeDevices.add(feeder)

    val result = homeDevices.find{
        it.category == "Camera"
    }
    result?.let {
        println(it.diagnose())
    }

    with(homeDevices){
        println("Jumlah perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run{
        sumOf{it.powerLoad}
    }
    println("Daya: $totalPower")

    homeDevices.forEach{
        println(it.diagnose())
    }
}