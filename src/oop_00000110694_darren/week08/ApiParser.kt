package oop_00000110694_darren.week08

class ApiParser{
    fun parseProduct(rawJson: Map<String, Any?>) : Product?{
        val id = requireNotNull(rawJson["id"] as? String){
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String){
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type){
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkOut(product: Product){
        val id = when (product){
            is Product.Clothing -> product.id
            is Product.Electronic -> product.id
        }

        val trxId = JavaPaymentService.processPayment(id)!!
        println("ID: $trxId")
    }
}