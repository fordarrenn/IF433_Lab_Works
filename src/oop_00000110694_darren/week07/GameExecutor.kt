package oop_00000110694_darren.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Ada monster, ${event.monsterName}")
        }
        is BattleState.SafeZone -> {
            println("Berada disafe zone!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Mengambil ${item.name} rarity: ${item.rarity}")
        }
        is BattleState.GameOver -> {
            println("Game over! ${event.reason}")
        }
    }
}