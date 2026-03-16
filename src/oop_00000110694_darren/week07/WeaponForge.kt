package oop_00000110694_darren.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            return Weapon(GameItem("Pedang kayu bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon{
            return Weapon(GameItem("Excalibur Pro Max", 1000, ItemRarity.EPIC), 2000)
        }
    }
}