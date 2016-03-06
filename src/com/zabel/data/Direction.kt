package com.zabel.data

/**
 * Created by mattlangreder on 2/4/16.
 */

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

