package oop_00000110694_darren.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIK]\n$name | $category | Status: ${if (isOnline) "Online" else "Offline"} | $powerLoad"
}