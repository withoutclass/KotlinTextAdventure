package com.zabel.data

import java.util.*

/**
 * @WorldGraph is the data holder for our game world
 *
 * Created by mattlangreder on 1/30/16.
 */

data class WorldGraph(val vertices: HashMap<Int, Location> = HashMap(),
                      val edges: List<Pair<Int, Int>> = ArrayList<Pair<Int, Int>>())