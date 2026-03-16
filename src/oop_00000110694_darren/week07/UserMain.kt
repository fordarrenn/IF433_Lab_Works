package oop_00000110694_darren.week07

fun main(){
    println("\n TEST REGULAR CLASS\n")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n TEST DATA CLASS\n")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil copy: $data3")

    val(userName, userAge) = data1
    println("Destruct: $userName berumur $userAge")
}