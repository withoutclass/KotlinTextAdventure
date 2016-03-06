package com.zabel.data

/**
 * Created by mattlangreder on 1/28/16.
 */

enum class PlayerAction(val actionName: String, val description: String) {
    GO("GO", "Move the player in the desired direction"),
    LOOK("LOOK", "See what is in the desired direction")
}

fun performMove(directionToMove: String) {
    // TODO: parse direction
    // TODO: get @Exit() from direction
    // TODO: determine vertex from direction
    val world = WorldGraph.get()
    val location = world.getNextLocation(Direction.valueOf(directionToMove))
    if (location != null) {
        println("you head to the $directionToMove and find yourself in the ${location.roomTitle}")
        // set the current location to the destination portion of the edge
        // assume that since there is a next location that our current location isn't null
        world.currentLocation = world.getCurrentLocation()!!.getExit(Direction.valueOf(directionToMove)).edge.second
    }
}

fun performLook(directionToLook: String) {
    // TODO: parse direction
    // TODO: use direction to print out what the player sees when looking
    val world = WorldGraph.get()
    val location = world.getNextLocation(Direction.valueOf(directionToLook))
    if (location != null) {
        println("You look to the $directionToLook and see ${location.roomDescription}")
    } else {
        println("You see nothing of particular interest to the $directionToLook")
    }
}
