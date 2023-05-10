package rsk.kotlin

import rsk.java.Created
import rsk.java.User

fun main(args: Array<String>) {
    var user = User("Kevin")

    var count = 0

    var eventListener =  Created({ println("User $it has been created: ${++count} times") })
    val evtU = { user: User -> println("User $user has been created: ${++count} times") }
    val evtL: (User) -> Unit = { println("User $it has been created: ${++count} times") }

    user.create(evtL)

    user.create { println("User $it has been created: ${++count} times") }
}