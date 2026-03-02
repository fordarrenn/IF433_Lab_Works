package oop_00000110694_darren.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if(balance >= amount){
            balance -= amount
            println("Saldo sisa: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Saldo sekarang: $balance")
    }
}