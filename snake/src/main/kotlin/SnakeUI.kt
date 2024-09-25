package org.example

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.enterRawMode
import com.github.ajalt.mordant.terminal.Terminal
import kotlin.time.Duration.Companion.seconds

class SnakeUI {
    private val terminal = Terminal(interactive = true)
    private val rawMode = terminal.enterRawMode()

    fun getPressedKey(): String? {
        return getKeyBoardEventOrNull()?.key
    }

    private fun getKeyBoardEventOrNull():KeyboardEvent? = rawMode.readKeyOrNull(timeout = 1.seconds)

    fun println(s:String) {
        terminal.println(s)
    }

    fun close(){
        rawMode.close()
    }

}