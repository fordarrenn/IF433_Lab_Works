package oop_00000110694_darren.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        var limits = usedAmount + amount
        if(limits <= limit){
            limits += usedAmount
            println("Success")
        } else {
            println("Transaksi Ditolak")
        }
    }
}