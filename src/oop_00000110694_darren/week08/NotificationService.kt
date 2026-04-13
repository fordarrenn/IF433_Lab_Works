package oop_00000110694_darren.week08

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}