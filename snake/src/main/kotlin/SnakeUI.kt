package org.example

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.enterRawMode
import com.github.ajalt.mordant.terminal.Terminal
import java.lang.Thread.sleep
import kotlin.time.Duration.Companion.microseconds

class SnakeUI {
    private val terminal = Terminal(interactive = true)
    private val rawMode = terminal.enterRawMode()
    private val cursor = terminal.cursor

    fun getPressedKey(): String? {
        return getKeyBoardEventOrNull()?.key
    }

    private fun getKeyBoardEventOrNull():KeyboardEvent? = rawMode.readKeyOrNull(timeout = 1.microseconds)

    fun println(s:String) {
        clearScreen()
        terminal.print(s)
        sleep(100)
    }

    fun close(){
        rawMode.close()
    }

    private fun clearScreen(){
        cursor.move { setPosition(0,0); clearScreen() }
        cursor.hide(false)
        //terminal.print("\u001Bc")
        //println("\u001Bc")
    }


}