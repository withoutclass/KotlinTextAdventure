package com.zabel.data

/**
 * Created by mattlangreder on 1/28/16.
 */

enum class PlayerAction(val actionName: String, val description: String) {
    GO("go", "Move the player in the desired direction"),
    LOOK("look", "See what is in the desired direction")
}

fun performMove(directionToMove: String) {
    // TODO: parse direction
    // TODO: get @Exit() from direction
    // TODO: determine vertex from direction
    println("you head to the $directionToMove")
}

fun performLook(directionToLook: String) {
    // TODO:
    println("You look to the $directionToLook")
}
