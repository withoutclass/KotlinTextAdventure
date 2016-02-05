package com.zabel.game

import com.zabel.data.Direction
import com.zabel.data.PlayerAction
import com.zabel.data.performLook
import com.zabel.data.performMove

/**
 * Created by mattlangreder on 1/27/16.
 */

fun main(args: Array<String>) {
    // TODO: build WorldGraph

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
            "quit","exit" -> System.exit(0)
            "help" -> showHelp()
            PlayerAction.GO.actionName -> performMove(userInput[1])
            PlayerAction.LOOK.actionName -> performLook(userInput[1])
            else -> {
                println("Invalid Command.  You can use 'help' to see a list of commands")
            }
        }
    }
}

fun showHelp() {
    // TODO: Print command list
    println("--------------------------------------------")
    println("|               Command List               |")
    println("1. go <direction>: Travel in given direction")
    println("2. look <direction>: Look in given direction")
    println("--------------------------------------------")
    println("|               Direction List              ")
    println("1. North")
    println("2. South")
    println("3. East")
    println("4. West")
    println("-----------------------------------------help---")

}
