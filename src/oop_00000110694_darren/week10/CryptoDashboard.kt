package oop_00000110694_darren.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 3.5))
    coinRepo.add(Coin("USDT", 5.5))
}