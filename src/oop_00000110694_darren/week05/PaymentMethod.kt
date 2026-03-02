package oop_00000110694_darren.week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}