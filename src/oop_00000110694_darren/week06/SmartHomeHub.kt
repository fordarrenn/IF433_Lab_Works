package oop_00000110694_darren.week06

class SmartHome {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {}
    fun turnOffAllSwitches(){
        for (device in devices) {
            when(device){
                is Switchable -> device.turnOff()
            }
        }
    }
}