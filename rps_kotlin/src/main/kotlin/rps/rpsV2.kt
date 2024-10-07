package rpsv2

fun greetPlayerAskChoiceHelper(playerName: String): String =  "Hey " + playerName + "! Please choose rock, paper or scissors!"

fun showRoundNumber(currentRound: Int, roundsToPlay: Int): String = currentRound.toString() + ". of " + roundsToPlay.toString() +  " Rounds"

fun greetPlayerAskNameHelper(number: Int): String = "Hello Player " + number.toString() + "! What's your name?"

fun printRoundNumber(currentRound: Int, roundsToPlay: Int) =
    println(showRoundNumber(currentRound, roundsToPlay))

// ------------- Bedingungen


fun showPlayerPoints(name: String, points: Int): String =
    name + " has " + points.toString() + " " + if (points == 1) "point" else "points"


fun showPlayersPoints(player1Name: String,
                      player2Name: String,
                      player1Points: Int,
                      player2Points: Int): String = showPlayerPoints(player1Name,player1Points) + "\n" + showPlayerPoints(player2Name,player2Points)



fun computeRoundWinner(p1: String, p2: String): String =
    when {
        p1 == p2 -> "Nobody"
        p1 == "rock" && p2 == "scissors" || p1 == "paper" && p2 == "rock" || p1 == "scissors" && p2 == "paper" -> "1"
        else -> "2"
    }



fun showWinnerWithNameHelper(
    winner: String,
    player1Name: String,
    player2Name: String,
    fullGame: Boolean
): String {
    val winnerName = when {
        winner == "1" -> player1Name
        winner == "2" -> player2Name
        else -> "Nobody"
    }
    return winnerName + " wins this " + (if (fullGame) "game" else "round") + "!"
}

fun showRoundWinnerWithName(roundWinner: String, player1Name: String, player2Name: String): String =
    showWinnerWithNameHelper(roundWinner, player1Name, player2Name, false)

fun showGameWinnerWithName(
    player1Name: String,
    player2Name: String,
    player1Points: Int,
    player2Points: Int
): String {
    val gameWinner = when {
        player1Points > player2Points -> "1"
        player2Points > player1Points -> "2"
        else -> "Nobody"
    }
    return showWinnerWithNameHelper(
        gameWinner,
        player1Name,
        player2Name,
        true
    )
}


fun computeNewPoints(roundWinner: String, playerNumber: Int, currentPoints: Int) =
    if (playerNumber.toString() == roundWinner) currentPoints + 1 else currentPoints

// ----------------------- Ausgabe
//fun printRoundWinnerWithName(roundWinner: String, player1Name: String, player2Name: String): Unit {
//    println(
//        showRoundWinnerWithName(
//            roundWinner, player1Name, player2Name
//        )
//    )
//}
//
//fun printPlayersPoints(
//    player1Name: String, player2Name: String, player1Points: Int, player2Points: Int
//): Unit {
//    println(showPlayerPoints(player1Name, player1Points))
//    println(showPlayerPoints(player2Name, player2Points))
//}

//fun printGameWinnerWithName(
//    player1Name: String, player2Name: String, player1Points: Int, player2Points: Int
//): Unit {
//    println(
//        showGameWinnerWithName(
//            player1Name, player2Name,
//            player1Points, player2Points,
//        )
//    )
//}
// ------------- Eingabe


fun greetPlayerAskName(number: Int): String {
    println(greetPlayerAskNameHelper(number))
    return readln()
}

fun aksRounds(): Int {
    println("How many rounds do you want to play? ")
    return readln().toInt()
}

fun greetPlayerAskChoice(playerName: String): String {
    println(greetPlayerAskChoiceHelper(playerName))
    return readln()
}

fun playOneRound(
    currentRound: Int, roundsToPlay: Int, player1Name: String, player2Name: String
): String {
    printRoundNumber(currentRound, roundsToPlay)
    val player1Decision = greetPlayerAskChoice(player1Name)
    val player2Decision = greetPlayerAskChoice(player2Name)
    val roundWinner = computeRoundWinner(player1Decision, player2Decision)
    println(showRoundWinnerWithName(roundWinner, player1Name, player2Name))
    return roundWinner
}
// ----------------------- For-Schleifen


fun playRPSHelper(
    roundsToPlay: Int, player1Name: String, player2Name: String
): Unit {
    var player1Points = 0
    var player2Points = 0
    for (currentRound in 1..roundsToPlay) {
        val winnerOfCurrentRound = playOneRound(
            currentRound, roundsToPlay, player1Name, player2Name
        )
        player1Points = computeNewPoints(
            winnerOfCurrentRound, 1, player1Points
        )
        player2Points = computeNewPoints(
            winnerOfCurrentRound, 2, player2Points
        )
        println(showPlayersPoints(
            player1Name, player2Name,
            player1Points, player2Points
        ))
    }
    println(showGameWinnerWithName(
        player1Name, player2Name,
        player1Points, player2Points
    ))
}

fun playRPS(): Unit {
    val player1Name = greetPlayerAskName(1)
    val player2Name = greetPlayerAskName(2)
    val roundsToPlay = aksRounds()
    playRPSHelper(roundsToPlay, player1Name, player2Name)
}

fun main(){
    rps.playOneRound(2,3,"Alan", "Grace")}