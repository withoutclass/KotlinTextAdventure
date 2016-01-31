/**
 * Created by mattlangreder on 12/2/15.
 */

package com.zabel.data

data class Location(val roomTitle: String, val roomDescription: String, val exits: List<Exit>)

data class Exit(val direction: Direction, val edge: Pair<Int, Int>)

enum class Direction(val longName: String, val shortName: String) {
    UNDEFINED("UNDEFINED", "XXX"),
    NORTH("NORTH", "N"),
    SOUTH("SOUTH", "S"),
    EAST("EAST", "E"),
    WEST("WEST", "W"),
    UP("UP", "U"),
    DOWN("DOWN", "D"),
    NORTHEAST("NORTHEAST", "N"),
    NORTHWEST("NORTHWEST", "N"),
    SOUTHEAST("SOUTHEAST", "S"),
    SOUTHWEST("SOUTHWEST", "S"),
    IN("IN", "I"),
    OUT("OUT", "O")
}

fun String.isDirection(): Boolean {
    for (c in Direction.values()) {
        if (c.equals(this)) {
            return true;
        }
    }

    return false;
}