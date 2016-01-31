package com.zabel.data

/**
 * Created by mattlangreder on 1/28/16.
 */

enum class PlayerAction(val actionName: String, val description: String) {
    GO("go", "Move the player in the desired direction"),
    LOOK("look", "See what is in the desired direction")
}