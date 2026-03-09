package oop_00000110694_darren.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name ($id) - dinyalakan")
        startRecord()
    }

    override fun startRecord() {
        println("CCTV Recording....")
    }

    override fun turnOff() {
        println("CCTV $name ($id) - dimatikan")
    }
}