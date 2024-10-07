package  jlineUI


import org.jline.reader.LineReader
import org.jline.reader.LineReaderBuilder
import org.jline.terminal.TerminalBuilder
import org.jline.utils.InfoCmp
import java.lang.Thread.sleep




    class JlineUI {
        private val terminal = TerminalBuilder.builder().dumb(false).build()
        init{ terminal.enterRawMode()}
        private val reader = terminal.reader()
        //private val display: Display = Display(terminal, true)
        private val lineReader : LineReader = LineReaderBuilder.builder().build()


        fun getPressedKey(): String? {
            return reader.read(1).toChar().toString()
        }


        fun println(s:String) {
            //display.clear()
            terminal.puts(InfoCmp.Capability.clear_screen)
            terminal.flush()
            terminal.writer().println(s)
            terminal.writer().flush()
            sleep(100)
        }

        fun close(){
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