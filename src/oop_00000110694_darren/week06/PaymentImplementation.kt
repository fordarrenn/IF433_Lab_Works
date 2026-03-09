package oop_00000110694_darren.week06

class Gopay : Paymentmethod {
    override fun pay(amount: Double) {
        println("Processing Rp. $amount via Gopay Server")
    }
}

class CreditCard : Paymentmethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp. $amount")
    }
}