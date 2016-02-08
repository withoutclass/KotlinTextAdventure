package com.zabel.game

/**
 * Created by mattlangreder on 1/27/16.
 */

fun getInput(): String {
    var input: String? = null
    while (input == null) {
        print("> ")
        input = readLine()
    }

    // TODO: prevent bad inputs

    return input.toLowerCase()
}



