package com.zabel.data

import java.util.*

/**
 * @WorldGraph is the data holder for our game world
 *
 * Created by mattlangreder on 1/30/16.
 */

// TODO: regular class, private constructor. Have the world graph build itself,
//  singleton pattern
data class WorldGraph private constructor(val vertices: HashMap<Int, Location> = HashMap()) {

    var currentLocation: Int = 0

    companion object {

        // the lazy delegate fires the lambda the very first time a get is called, and then remembers the
        // computed value for subsequent gets.  We can put the World building code in here to be invoked on the first get,
        // then use the main @{WorldGraph.get()} go grab an "instance" of the graph
        private val instance: WorldGraph by lazy {
            // TODO: break out location creation into another function, and pass that function result to the WorldGraph
            // Constructor
            val locMap = HashMap<Int, Location>()
            locMap.put(0, Location("Exploratorium Gates", "The gates to a most excellent place", ArrayList<Exit>()))
            locMap[0]?.addExit(Exit(Direction.NORTH, Pair(0, 1)))
            locMap.put(1, Location("Exploratorium entryway", "The entryway in to the exploratorium", ArrayList<Exit>()))

            // TODO: hallway location

            // In kotlin, the last line of a closure is what is assigned / returned
            WorldGraph(locMap)
        }

        fun get(): WorldGraph {
            return instance
        }
    }

    fun getCurrentLocation(): Location? {
        return vertices[currentLocation];
    }

    fun getNextLocation(directionToExit: Direction): Location? {
        val nextExit = getCurrentLocation()?.getExit(directionToExit)

        if (nextExit != null) {
            if (currentLocation == nextExit.edge.first) {
                currentLocation = nextExit.edge.second
                return vertices[currentLocation]
            } else if (currentLocation == nextExit.edge.second){
                currentLocation = nextExit.edge.first
                return vertices[currentLocation]
            }
        }

        return null
    }
}

