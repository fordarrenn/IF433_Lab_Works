package oop_00000110694_darren.week08

object DataBaseMock{
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest(){
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DataBaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") {"Test Failed! Initial is wrong."}
    println("Test passed: Initial is T")
}