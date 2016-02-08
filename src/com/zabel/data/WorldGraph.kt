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

            // TODO: hallway location

            // In kotlin, the last line of a closure is what is assigned / returned
            WorldGraph(locMap)
        }

        fun get(): WorldGraph {
            return instance
        }
    }


}

