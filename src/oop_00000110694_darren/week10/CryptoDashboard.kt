package oop_00000110694_darren.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 3.5))
    coinRepo.add(Coin("USDT", 5.5))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach{
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-BTC", 500.0))
    txRepo.add(Transaction("TX-ETH", 700.0))
    txRepo.getAll().forEach {
        println("Trans: ${it.id} - ${it.amount}")
    }
}