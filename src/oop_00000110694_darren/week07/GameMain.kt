package oop_00000110694_darren.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    val legend = ItemRarity.LEGENDARY
    println(legend)

    val forge1 = Weapon.forgeStarterSword()
    println(forge1)

    val forge2 = forge1.item.copy(damage = 25)
    println("Upgrade: ${forge2.name} damage: ${forge2.damage}")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(forge2))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}