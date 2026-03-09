package oop_00000110694_darren.week06

interface Clickable{
    val name: String

    fun click()
}

class Button(override val name: String) : Clickable{
    override fun click() {
        println("Tombol $name ditekan!")
    }
}