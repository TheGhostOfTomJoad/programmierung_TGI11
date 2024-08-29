import org.example.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {
    @Test
    fun greetPlayerAskChoiceHelper() {
        assertEquals( "Hey Alan! Please choose rock, paper or scissors!", greetPlayerAskChoiceHelper("Alan"))
        assertEquals("Hey Grace! Please choose rock, paper or scissors!", greetPlayerAskChoiceHelper("Grace"))
    }

    @Test
    fun showRoundNumber() {
        assertEquals("Round 1 of 3", showRoundNumber(1, 3))
        assertEquals("Round 2 of 7", showRoundNumber(2, 7))

    }

    @Test
    fun greetPlayerAskNameHelper() {
        assertEquals("Hello Player 1! What's your name?", greetPlayerAskNameHelper(1))
        assertEquals("Hello Player 2! What's your name?", greetPlayerAskNameHelper(2))

    }


    @Test
    fun showPlayerPoints() {
        assertEquals("Alan has 0 points", showPlayerPoints("Alan", 0))
        assertEquals("Grace has 1 point", showPlayerPoints("Grace", 1))
        assertEquals("Grace has 2 points", showPlayerPoints("Grace", 2))
        assertEquals("Grace has 3 points", showPlayerPoints("Grace", 3))
    }

    @Test
    fun computeRoundWinner() {
        assertEquals("Nobody", computeRoundWinner("rock", "rock"))
        assertEquals("2", computeRoundWinner("rock", "paper"))
        assertEquals("1", computeRoundWinner("scissors", "paper"))
    }

    @Test
    fun computeGameWinner() {
        assertEquals("2", computeGameWinner(3, 4))
        assertEquals("Nobody", computeGameWinner(1, 1))
        assertEquals("1", computeGameWinner(1, 0))
    }


    @Test
    fun showWinnerWithNameHelper() {
        assertEquals("Alan wins this game!", showWinnerWithNameHelper("2", "Grace", "Alan", true))
        assertEquals("John wins this round!", showWinnerWithNameHelper("2", "Paul", "John", false))
        assertEquals("Grace wins this game!", showWinnerWithNameHelper("1", "Grace", "Alan", true))
        assertEquals("Paul wins this round!", showWinnerWithNameHelper("1", "Paul", "John", false))
        assertEquals("Nobody wins this round!", showWinnerWithNameHelper("Nobody", "Paul", "John", false))


    }

    @Test
    fun showRoundWinnerWithName() {
        assertEquals("Paul wins this round!", showRoundWinnerWithName("1", "Paul", "John"))
        assertEquals("Grace wins this round!", showRoundWinnerWithName("1", "Grace", "Alan"))
        assertEquals("Alan wins this round!", showRoundWinnerWithName("2", "Grace", "Alan"))
        assertEquals("John wins this round!", showRoundWinnerWithName("2", "Paul", "John"))
        assertEquals("Nobody wins this round!", showRoundWinnerWithName("Nobody", "Mick", "David"))


    }

    @Test
    fun showGameWinnerWithName() {
        assertEquals(showGameWinnerWithName("Paul", "John", 3, 1), "Paul wins this game!")
        assertEquals(showGameWinnerWithName("Paul", "John", 3, 5), "John wins this game!")
        assertEquals(showGameWinnerWithName("Grace", "Alan", 1, 0), "Grace wins this game!")
        assertEquals(showGameWinnerWithName("Grace", "Alan", 1, 2), "Alan wins this game!")


    }

    @Test
    fun computeNewPoints() {
        assertEquals(4, computeNewPoints("1", 1, 3))
        assertEquals(6, computeNewPoints("1", 1, 5))
        assertEquals(1, computeNewPoints("2", 2, 0))
        assertEquals(4, computeNewPoints("2", 2, 3))
    }
}