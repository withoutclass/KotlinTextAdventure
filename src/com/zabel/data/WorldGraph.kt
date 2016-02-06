package com.zabel.data

import java.util.*

/**
 * @WorldGraph is the data holder for our game world
 *
 * Created by mattlangreder on 1/30/16.
 */

data class WorldGraph(val vertices: HashMap<Int, Location> = HashMap()) {

    companion object Builder {
        fun build(): WorldGraph {
            val locMap = HashMap<Int, Location>()
            locMap.put(0, Location("Exploratorium Gates", "The gates to a most excellent place", ArrayList<Exit>()))
            locMap[0]?.addExit(Exit(Direction.NORTH, Pair(0, 1)))
            // TODO: hallway location
            return WorldGraph(locMap)
        }
    }
}

