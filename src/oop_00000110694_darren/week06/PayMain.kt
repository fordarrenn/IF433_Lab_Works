package oop_00000110694_darren.week06

fun processCheckOut(method: Paymentmethod, amount: Double) {
    println("-> Memulai CheckOut")
    method.pay(amount)
}

fun main(){
    val myWatch = SmartWatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    processCheckOut(pay1, 50000.0)
    processCheckOut(pay2, 150000.0)
}