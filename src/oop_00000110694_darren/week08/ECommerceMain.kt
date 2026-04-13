package oop_00000110694_darren.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()
    for(r in rawApiData){
        try {
            parser.parseProduct(r)?.let {product ->
                when(product){
                    is Product.Electronic -> println("${product.name} is Electronic, Warranty: ${product.warrantyMonths}")
                    is Product.Clothing -> println("${product.name} is Clothing, Size: ${product.size}")
                }
                parser.checkOut(product)
            }
        } catch(e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

// tested