package org.example

import com.github.ajalt.mordant.input.KeyboardEvent
import com.googlecode.lanterna.graphics.TextGraphics
import com.googlecode.lanterna.input.KeyStroke
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal
import java.lang.Thread.sleep
import kotlin.time.Duration.Companion.microseconds


class SnakeUILaterna {
    private val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    private val screen: Screen = TerminalScreen(terminal)
    init{ screen.startScreen();}
    private val textGraphics: TextGraphics = screen.newTextGraphics()


    fun getPressedKey(): String? {
        return getKeyBoardEventOrNull()?.character.toString()
    }

    private fun getKeyBoardEventOrNull(): KeyStroke? = screen.pollInput()

    fun println(s:String) {
        screen.clear()
        textGraphics.putString(0,0,s)
        screen.refresh()
        sleep(100)
    }

    fun close(){
        screen.stopScreen()
        screen.close()
        terminal.close()
    }

//    private fun clearScreen(){
//        cursor.hide(false)
//        cursor.move { setPosition(0,0); clearScreenAfterCursor() }
//        //cursor.hide(false)
//        //terminal.rawPrint("\u001Bc")
//        cursor.hide(false)
//        //cursor.hide(false)
//        //println("\u001Bc")
//    }


}