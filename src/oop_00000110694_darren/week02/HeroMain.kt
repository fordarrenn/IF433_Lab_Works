package oop_00000110694_darren.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- SIMPLE HERO GAME ---")
    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    if(heroName.isBlank()){
        println("Masukkan nama hero!")
        return
    }

    print("Masukkan damage hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val hero1 = Hero(heroName, baseDamage = baseDamage)
    var enemyHp = 100

    while(hero1.isAlive() && enemyHp > 0){
        println("--- OPTION ---")
        println("[1] Attack")
        println("[2] Flee")
        print("Pilih: ")
        val choice = scanner.nextInt()

        when(choice){
            1 -> {
                hero1.attack("Vanya")
                enemyHp -= hero1.baseDamage
                if(enemyHp < 0){
                    enemyHp = 0
                }
                println("Enemy HP: $enemyHp")

                if(enemyHp > 0){
                    val enemyDamage = (10..20).random()
                    println("Enemy attacks back!")
                    hero1.takeDamage(enemyDamage)
                    println("Hero ${hero1.heroName}: ${hero1.hp}")
                }
            }

            2 -> {
                println("${hero1.heroName} flees!")
                break
            }

            else -> println("${hero1.heroName} dies of cringe, please choose the right options!")
        }
    }

    println("--- BATTLE RESULT ---")
    when{
        hero1.isAlive() && enemyHp <= 0 -> println("${hero1.heroName} wins")
        !hero1.isAlive() -> println("${hero1.heroName} losses!")
        else -> println("Well... well... well...")
    }
}