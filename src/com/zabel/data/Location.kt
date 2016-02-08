/**
 * Created by mattlangreder on 12/2/15.
 */

package com.zabel.data

data class Location(val roomTitle: String, val roomDescription: String, val exits: MutableList<Exit>)

data class Exit(val direction: Direction, val edge: Pair<Int, Int>)

fun Location.addExit(exit: Exit) {
    this.exits.add(exit)
}

fun Location.getExit(direction: Direction) : Exit{
    // This is my first use of higher order in the game! Woooo
    return exits.filter { it.direction == direction }.first()
}
