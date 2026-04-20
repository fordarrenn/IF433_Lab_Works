package oop_00000110694_darren.week09

fun main(){
    println("=== TEST LIST ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C++")

    println("Immutable list: $framework")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers (set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf(
        "Apple" to 50,
        "Bananas" to 30
    )

    inventory["Oranges"] = 20
    inventory["Apple"] = 45
    println("Inventory: $inventory")
}