import kotlin.test.Test
import kotlin.test.assertEquals



class MyTests {
    @Test /* = Test */
    fun myTest(): Unit {
        assertEquals(3, 3)
    }
}
fun main () {
    myTest()
}


fun myTest(): Unit {
    assertEquals(3, 3)
}