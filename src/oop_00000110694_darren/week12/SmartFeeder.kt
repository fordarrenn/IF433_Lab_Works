package oop_00000110694_darren.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed){
        throw DispenserJamException()
    }
    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50

    try {
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException){
        println("Dispenser error: ${e.message}")
    } catch (e: FoodEmptyException){
        println("Food error: ${e.message}")
    } catch (e: Exception) {
        println("General error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching {
        dispenseKibble(30, 1000, false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa: $currentKibbleStock gr")
    }.onFailure { e ->
        println("Peringatan ke pemilik: ${e.message}")
    }
    // executing
}