---
title: Schere-Stein-Papier-Projekt
codebraid:
  jupyter: true
---
---

```{.kotlin .cb-run}

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




```


# String-Addition

## Aufgabe
Implementiere eine Funktion `greetPlayerAskChoiceHelper`{.kotlin},
die einen Namen als String übergeben bekommt und einen String
zurückgibt, in dem die Person gebeten wird, sich für Schere, Stein oder
Papier zu entscheiden.

```{.kotlin .cb-nb first_number=1}
greetPlayerAskChoiceHelper("Anna")
```
```{.kotlin .cb-nb first_number=1}
greetPlayerAskChoiceHelper("Timo")
```


# String-Addition und Typkonversion

## Aufgabe
Implementiere eine Funktion `showRoundNumber`{.kotlin}, die zwei
Integer als Argumente übergeben bekommt. Dabei handelt es sich um die
Runde die gerade gespielt wird und die Anzahl der Runden, die insgesamt
gespielt werden. Die Funktion gibt einen String zurück, in dem beide
Informationen enthalten sind.

```{.kotlin .cb-nb first_number=1}
showRoundNumber(1, 3)
```
```{.kotlin .cb-nb first_number=1}
showRoundNumber(4, 5)
```


## Aufgabe
Implementiere eine Funktion `greetPlayerAskNameHelper`{.kotlin}.
Dieser Funktion wird die Nummer eines Spielers als Integer übergeben.
Sie gibt einen String zurück, in dem der Spieler begrüßt und nach seinem
Namen gefragt wird.

```{.kotlin .cb-nb first_number=1}
greetPlayerAskNameHelper(1)
```
```{.kotlin .cb-nb first_number=1}
greetPlayerAskNameHelper(2)
```


# Ausgabe

## Aufgabe
Implementiere eine Funktion `printRoundNumber`{.kotlin}. Dieser
Funktion werden die aktuelle Rundenzahl und die Anzahl der Runden die
insgesamt gespielt werden als Integer übergeben. Sie gibt beide
Informationen an der Konsole aus.

```{.kotlin .cb-nb first_number=1}
printRoundNumber(1, 5)
```
```{.kotlin .cb-nb first_number=1}
printRoundNumber(1, 1)
```

Nutze `showRoundNumber`{.kotlin}!


# Bedingungen




## Aufgabe
Implementiere eine Funktion `showPlayerPoints`{.kotlin}. Dieser
Funktion wird ein Name als String und eine Punktezahl als Integer
übergeben. Sie gibt einen String zurück, in dem steht wie viele Punkte
die Person hat. 

```{.kotlin .cb-nb first_number=1}
showPlayerPoints("Kevin", 1)
```
```{.kotlin .cb-nb first_number=1}
showPlayerPoints("Barbara", 3)
```

Beachte, dass im ersten Beispiel `point` und nicht `points` zu sehen ist.




## Aufgabe
Implementiere eine Funktion `showPlayersPoints`{.kotlin}. Dieser
Funktion werden die Namen der Spieler als Strings und ihre Punktezahlen als Integer
übergeben. Sie gibt einen String zurück, in dem steht wie viele Punkte
die ide Spieler haben. Ziwschen beiden Information steht das Zeichen `\n`.

```{.kotlin .cb-nb first_number=1}
showPlayersPoints("Kevin", "Barbara", 1,  3)
```


Nutze `showPlayerPoints`{.kotlin}!

## Aufgabe
Implementiere eine Funktion `computeNewPoints`{.kotlin}. Dieser wird
der Gewinner der letzten Runde, die Nummer eines Spielers und die
Punktzahl des Spielers mit dieser Nummer übergeben. Die einzigen
Möglichkeiten für das erste Argument sind `"1"`{.kotlin}, `"2"`{.kotlin}
und `"Nobody"`{.kotlin}. Die Funktion gibt die neue Punktzahl des
Spielers zurück.

```{.kotlin .cb-nb first_number=1}
computeNewPoints("1", 1, 3)
```
```{.kotlin .cb-nb first_number=1}
computeNewPoints("2", 1, 3)
```
```{.kotlin .cb-nb first_number=1}
computeNewPoints("Nobody", 1, 1)
```



## Aufgabe
Implementiere eine Funktion `computeRoundWinner`{.kotlin}. Dieser
werden die Eingaben der beiden Spieler als Strings übergeben. Sie gibt
zurück, wer die Runde gewonnen hat. Die einzigen möglichen Argumente
sind `"rock"`{.kotlin}, `"paper"`{.kotlin} und `"scissors"`{.kotlin}.
Die einzigen möglichen Rückgabewerte sind `"1"`{.kotlin}, `"2"`{.kotlin}
und `"Nobody"`{.kotlin}.

<!-- ![<https://upload.wikimedia.org/wikipedia/commons/6/67/Rock-paper-scissors.svg>](rock-paper-scissors){width="50%"} -->

```{.kotlin .cb-nb first_number=1}
computeRoundWinner("rock", "scissors")
```
```{.kotlin .cb-nb first_number=1}
computeRoundWinner("rock", "paper")
```
```{.kotlin .cb-nb first_number=1}
computeRoundWinner("rock","rock")
```




## Aufgabe
Implementiere eine Funktion `showWinnerWithNameHelper`{.kotlin}.
Dieser wird übergeben, wer das Spiel/die Runde gewonnen hat. Die
einzigen Möglichkeiten sind `"1"`{.kotlin}, `"2"`{.kotlin} und
`"Nobody"`{.kotlin}. Außerdem werden die Namen der Spieler und ein
Boolean übergeben. Wenn dieses `true`{.kotlin} ist soll als String
zurückgegeben werden welcher Spieler, das Spiel gewonnen hat. Ansonsten
wird zurückgegeben welcher Spieler die Runde gewonnen hat. In dem String
werden die übergebenen Namen verwendet.

```{.kotlin .cb-nb first_number=1}
showWinnerWithNameHelper("1", "Grace", "Alan", true)
```
```{.kotlin .cb-nb first_number=1}
showWinnerWithNameHelper("2", "Grace", "Alan", false)
```
```{.kotlin .cb-nb first_number=1}
showWinnerWithNameHelper("Nobody", "Grace", "Alan", false)
```


## Aufgabe
Implementiere eine Funktion `showRoundWinnerWithName`{.kotlin}. Dieser wird
übergeben wer das Spiel gewonnen hat. Die einzigen Möglichkeiten sind
`"1"`{.kotlin}, `"2"`{.kotlin} und `"Nobody"`{.kotlin}. Außerdem werden
die Namen der Spieler übergeben. Die Funktion gibt einen String zurück
in dem steht, wer die Runde gewonnen hat. In dem String wird der Name
des Spielers verwendet.

```{.kotlin .cb-nb first_number=1}
showRoundWinnerWithName("1", "Grace", "Alan")
```
```{.kotlin .cb-nb first_number=1}
showRoundWinnerWithName("2", "Grace", "Alan")
```
```{.kotlin .cb-nb first_number=1}
showRoundWinnerWithName("Nobody", "Grace", "Alan")
```

Nutze `showWinnerWithNameHelper`{.kotlin}!


## Aufgabe
eine Funktion `showGameWinnerWithName`{.kotlin}. Dieser werden Namen
der Spieler als Strings und ihre die Punktezahlen als Integer übergeben.
Die Funktion gibt einen String zurück in dem steht, wer das Spiel
gewonnen hat.

```{.kotlin .cb-nb first_number=1}
showGameWinnerWithName("Grace", "Alan", 1, 2)
```
```{.kotlin .cb-nb first_number=1}
showGameWinnerWithName("Grace", "Alan", 5, 0)
```
```{.kotlin .cb-nb first_number=1}
showGameWinnerWithName("Grace", "Alan", 1 , 1)
```

Nutze `showWinnerWithNameHelper`{.kotlin}!






# Eingabe

## Aufgabe
Implementiere eine Funktion `greetPlayerAskName`{.kotlin}. Der
Funktion wird eine Spielernummer als Integer übergeben. Sie fordert den
Spieler dazu auf seinen Namen an der Konsole einzugeben. Der Name wird
anschließend zurückgegeben.

<!-- ![image](greetPlayerAskName){width="80%"} -->

Nutze `greetPlayerAskNameHelper`{.kotlin}!


## Aufgabe
Schreibe eine Funktion `ask_rounds`{.kotlin}, die fragt wie viele Runden
gespielt werden sollen. Diese Eingabe wird als Integer zurückgegeben.

<!-- ![image](ask_rounds){width="80%"} -->



## Aufgabe
Implementiere eine Funktion `greetPlayerAskChoice`{.kotlin}. Der
Funktion wird eine Spielername als String übergeben. Sie fordert die
Spielerin dazu auf Schere, Stein oder Papier einzugeben. Die Auswahl
wird als String zurückgegeben.

<!-- ![image](greetPlayerAskChoice){width="80%"} -->

Nutze `greetPlayerAskChoiceHelper`{.kotlin}


## Aufgabe
Implementiere eine Funktion `playOneRound`{.kotlin}. Dieser Funktion
werden die aktuelle Rundenzahl und die Zahl der Runden, die gespielt
werden, übergeben. Sie gibt diese beiden Informationen in der Konsole
aus. Der Funktion werden auch die Namen der Spieler übergeben. Sie
spricht die Spieler mit ihren Namen an und bittet sie Schere, Stein oder
Papier einzugeben. Das Ergebnis dieser Runde wird anschließend ausgegeben. 
Hierbei wird der Name des Gewinners genutzt.

Es wird auch zurückgegeben, wer gewonnen hat. Die einzig möglichen
Rückgabewerte sind `"1"`{.kotlin}, `"2"`{.kotlin} und
`"Nobody"`{.kotlin}.

<!-- ![image](playOneRound){width="80%"}
``` -->
Nutze `showRoundNumber`{.kotlin}, `greetPlayerAskChoice`{.kotlin},
 `computeRoundWinner`{.kotlin} und `showRoundWinnerWithName`{.kotlin}!
 




## Aufgabe
Implementiere eine Funktion `playRPSHelper`{.kotlin}. Diese Funktion
werden die Anzahl der Runden, die gespielt werden und die Namen der
Spieler übergeben. Sie spielt das Spiel unter diesen Bedingungen.
Nachdem alle Runden gespielt wurden, wird das Endergebnis ausgegeben.

Beispiel:
```
1. of 3 Rounds
Hey Alan! Please choose rock, paper or scissors!
...
...
```


Nutze `playOneRound`{.kotlin}, `computeNewPoints`{.kotlin} und
 `showPlayersPoints`{.kotlin}!
 




## Aufgabe
Implementiere eine Funktion `playRPS`{.kotlin}. Diese Funktion fragt
zwei Spieler nach ihren Namen. Anschließend fragt sie wie viele Runden
gespielt werden sollen. Danach wird das Spiel mit diesen Einstellungen
durchgeführt.\

Beispiel:
```
Hello Player 1! What's your name?
Alan
Hello Player 2! What's your name?
Grace
How many rounds do you want to play? 
3
1. of 3 Rounds
Hey Alan! Please choose rock, paper or scissors!
```



Nutze `greetPlayerAskName`{.kotlin}, `aksRounds`{.kotlin} und
 `playRPSHelper`{.kotlin}!






## Aufgabe
Nutze das Kontrollzeichen `"\n"`{.kotlin} im Code um bei der Ausgabe
Zeilen zu überspringen.

# Verbesserungen

# While-Schleifen

## Aufgabe
Implementiere eine Funktion `getCorrectInput`{.kotlin}, die den
Benutzer solange auffordert etwas einzugeben, bis die Eingabe
`rock`{.kotlin}, `paper`{.kotlin} oder `scissors`{.kotlin} ist. Diese
Eingabe wird dann zurückgegeben.




## Aufgabe
Implementiere eine Funktion `getCorrectRoundCounter`{.kotlin}, die
zwei Zahlen als Integer übergeben bekommt. Die Funktion fordert die
Benutzerin auf eine Rundenzahl zwischen diesen beiden Zahlen einzugeben
und fragt solange nach, bis die Eingabe korrekt war.
```


## Aufgabe
Bau diese Funktionen in das vollständige Programm ein! --> 
