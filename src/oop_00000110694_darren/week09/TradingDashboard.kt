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

    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}

    val winningTrades = closedTrades.filter{it.roe > 0}
    val losingTrades = closedTrades.filter{it.roe <= 0}

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map{
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map{
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map{it.pair}
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach {
        println(it)
    }
    worstPerformersString.forEach {
        println(it)
    }
    println(uniquePairs)
}