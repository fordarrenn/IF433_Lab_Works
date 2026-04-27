package oop_00000110694_darren.week10

class WalletRepository <T> (){
    private val items = mutableListOf<T>()

    fun add (item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(name: String): List<T> {
        return items.filter{
            when(it){
                is Coin -> it.name.contains(name, ignoreCase = true)
                else -> false
            }
        }
    }
}