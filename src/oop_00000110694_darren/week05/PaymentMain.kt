package oop_00000110694_darren.week05

fun main(){
    val vlad = EWallet("Vladimir Lenin", 50000.0)
    val dmitry = CreditCard("Dmitry", 1000000.0)

    val accounts: List<PaymentMethod> = listOf(vlad, dmitry)
    for(acc in accounts){
        acc.processPayment(75000.0)
    }
}