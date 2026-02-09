package oop_00000110694_darren.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY LOAN SYSTEM ---")
    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama: ")
    val borrower = scanner.nextLine()

    if(bookTitle.length == 0 || borrower.length == 0){
        println("Masukkan nama atau judul buku!")
    } else {
        print("Durasi peminjaman: ")
        var loanDuration = scanner.nextInt()
        scanner.nextLine()

        if(loanDuration < 0){
            loanDuration = 1
        }

        val loan = Loan(bookTitle, borrower, loanDuration)

        println("--- DETAIL PEMINJAMAN ---")
        println("Judul Buku   : ${loan.bookTitle}")
        println("Peminjam    : ${loan.borrower}")
        println("Lama Pinjam : ${loan.loanDuration} hari")
        println("Total Denda : Rp ${loan.calculateFine()}")
    }
}