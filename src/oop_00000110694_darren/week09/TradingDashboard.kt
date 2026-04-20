package oop_00000110694_darren.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 5.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -2.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 3.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 15, -1.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 5, 4.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -3.0, "CLOSED")
    )
}