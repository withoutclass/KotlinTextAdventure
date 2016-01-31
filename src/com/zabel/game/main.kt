package com.zabel.game

import com.zabel.data.Direction
import com.zabel.data.PlayerAction

/**
 * Created by mattlangreder on 1/27/16.
 */

fun main(args: Array<String>) {

    val directions = Direction.DOWN
    // build locations

    // Title Screen
    println("---------------------------------")
    println("| Zabel's Exploratorium |")
    println("| Enter commands at the prompt")
    println("| You can use the 'help' command to see available commands")
    println("---------------------------------")

    // Start game loop
    var playing = true
    while (playing) {

        // Get user input
        // Let's assume that getInput is doing the work of sanitizing what we get back
        val userInput: List<String> = getInput().split(delimiters = ' ')

        when (userInput.first()) {
            "quit" -> System.exit(0)
            "help" -> showHelp()
            PlayerAction.GO.actionName -> performMove(userInput[1])
            PlayerAction.LOOK.actionName -> performLook(userInput[1])

        }
    }
}

fun performMove(directionToMove: String) {
    // TODO: parse direction
    // TODO: get @Exit() from direction
    // TODO: determine vertex from direction
}

fun performLook(directionToLook: String) {
    // TODO:
}

fun showHelp() {
    // TODO: Print command list
}

//Direction.NORTH.longName, Direction.NORTH.shortName -> movePlayer(Direction.NORTH)
//Direction.SOUTH.longName, Direction.SOUTH.shortName  -> movePlayer(Direction.SOUTH)
//Direction.EAST.longName, Direction.EAST.shortName -> movePlayer(Direction.EAST)
//Direction.WEST.longName, Direction.WEST.shortName -> movePlayer(Direction.WEST)
//Direction.UP.longName, Direction.UP.shortName -> playerLook(Direction.UP)
//Direction.DOWN.longName, Direction.DOWN.shortName -> playerLook(Direction.DOWN)