---
title: Schere-Stein-Papier-Projekt
---

::: VerbatimOut
\# -------------- String-Addition

def greet_player_ask_choice_helper(player_name: str) -\> str: return
\"Hey \" + player_name + \"! Please choose rock, paper or scissors! \"

\# -------------- String-Addition + Typkonversion

def show_round_number(current_round: int, rounds_to_play: int): return
\"Round \" + str(current_round) + \" of \" + str(rounds_to_play)

def greet_player_ask_name_helper(number: int) -\> str: return \"Hello
Player \" + str(number) + \"! What's your name? \"

\# ------------- Ausgabe

def print_round_number(current_round: int, rounds_to_play: int) -\>
None: print(show_round_number(current_round, rounds_to_play))

\# ------------- Bedingungen

def point_or_points(points: int) -\> str: if points == 1: return
\"point\" else: return \"points\"

def show_player_points(name: str, points: int) -\> str: return name + \"
has \" + str(points) + \" \" + point_or_points(points)

def compute_round_winner(p1: str, p2: str) -\> str: if p1 == p2: return
\"Nobody\" if ( p1 == \"rock\" and p2 == \"scissors\" or p1 == \"paper\"
and p2 == \"rock\" or p1 == \"scissors\" and p2 == \"paper\" ): return
\"1\" else: return \"2\"

def compute_game_winner(player1_points: int, player2_points: int) -\>
str: if player1_points \> player2_points: return \"1\" elif
player2_points \> player1_points: return \"2\" else: return \"Nobody\"

def result_to_name(winner: str, player_1_name: str, player_2_name: str)
-\> str: if winner == \"1\": return player_1_name if winner == \"2\":
return player_2_name else: return winner

def round_or_game(full_game: bool) -\> str: if full_game: return
\"game\" else: return \"round\"

def show_round_or_game_winner(name: str, full_game: bool) -\> str:
return name + \" wins this \" + round_or_game(full_game) + \"!\"

def show_winner_with_name_helper(winner: str, player_1_name: str,
player_2_name: str, full_game: bool) -\> str: return
show_round_or_game_winner(result_to_name(winner, player_1_name,
player_2_name), full_game)

def show_round_winner_with_name(round_winner: str, player_1_name: str,
player_2_name: str) -\> str: return
show_winner_with_name_helper(round_winner, player_1_name, player_2_name,
False)

def show_game_winner_with_name(player_1_name: str, player_2_name: str,
player1_points: int, player2_points: int) -\> str: return
show_winner_with_name_helper(compute_game_winner(player1_points,
player2_points), player_1_name, player_2_name, True)

def compute_new_points(round_winner: str, player_number: int,
current_points: int) -\> int: if str(player_number) == round_winner:
return current_points + 1 else: return current_points

\# ----------------------- Ausgabe def
print_round_winner_with_name(round_winner: str, player_1_name: str,
player_2_name: str) -\> None: print(show_round_winner_with_name(
round_winner, player_1_name, player_2_name))

def print_players_points( player1_name: str, player2_name: str,
player1_points: int, player2_points: int ) -\> None:
print(show_player_points(player1_name, player1_points))
print(show_player_points(player2_name, player2_points))

def print_game_winner_with_name( player_1_name: str, player_2_name: str,
player1_points: int, player2_points: int ) -\> None:
print(show_game_winner_with_name(player_1_name, player_2_name,
player1_points, player2_points, ))

\# ------------- Eingabe

def greet_player_ask_name(number: int) -\> str: return
input(greet_player_ask_name_helper(number))

def greet_player_ask_choice(player_name: str) -\> str: return
input(greet_player_ask_choice_helper(player_name))

def play_one_round( current_round: int, rounds_to_play: int,
player_1_name: str, player_2_name: str ) -\> str:
print_round_number(current_round, rounds_to_play) player1_decision =
greet_player_ask_choice(player_1_name) player2_decision =
greet_player_ask_choice(player_2_name) round_winner =
compute_round_winner(player1_decision, player2_decision)
print_round_winner_with_name(round_winner, player_1_name, player_2_name)
return round_winner

\# ----------------------- For-Schleifen

def play_rps_helper( rounds_to_play: int, player_1_name: str,
player_2_name: str ) -\> None: player_1_points = 0 player_2_points = 0
for current_round in range(1, rounds_to_play + 1):
winner_of_current_round = play_one_round( current_round, rounds_to_play,
player_1_name, player_2_name) player_1_points = compute_new_points(
winner_of_current_round, 1, player_1_points) player_2_points =
compute_new_points( winner_of_current_round, 2, player_2_points)
print_players_points(player_1_name, player_2_name, player_1_points,
player_2_points) print_game_winner_with_name(player_1_name,
player_2_name, player_1_points, player_2_points)

def play_rps() -\> None: player_1_name = greet_player_ask_name(1)
player_2_name = greet_player_ask_name(2) rounds_to_play =
int(input(\"How many rounds do you want to play? \"))
play_rps_helper(rounds_to_play, player_1_name, player_2_name)

\#
--------------------------------------------------------------------------
\# Improvements

def is_in_interval(number_as_str: str, start: int, end: int) -\> bool:
for i in range(start, end + 1): if number_as_str == str(i): return True
return False

def greet_player_ask_correct_choice(name: str) -\> str:
print(greet(name)) return get_correct_choice()

def get_correct_choice() -\> str: user_input = input(\"Please choose
rock, paper or scissors! \") while not ( user_input == \"scissors\" or
user_input == \"paper\" or user_input == \"rock\" ): print(user_input +
\" is not a valid choice!\") user_input = input(\"Please choose rock,
paper or scissors! \") \# print(20 \* \"\") return user_input

def greet(name: str) -\> str: return \"Hey, \" + name + \"!\"

def get_correct_number_of_rounds(start: int, end: int) -\> int:
request_to_user = \"Please choose a number between \" +  str(start) + \"
and \" + str(end) + \" \" user_input = input(request_to_user) while not
( is_in_interval(user_input, start, end) ): print(user_input + \" is not
a valid choice!\") user_input = input(request_to_user) \# print(20 \*
\"\") return int(user_input)

#play_rps_many_rounds()
:::

# String-Addition

:::: aufgabe
Implementiere eine Funktion , die einen Namen als String übergeben
bekommt und einen String zurückgibt, in dem die Person gebeten wird,
sich für Schere, Stein oder Papier zu entscheiden.

::: pyconsole
greet_player_ask_choice_helper(\"Anna\")
greet_player_ask_choice_helper(\"Timo\")
:::
::::

# String-Addition und Typkonversion

:::: aufgabe
Implementiere eine Funktion , die zwei Integer als Argumente übergeben
bekommt. Dabei handelt es sich um die Runde die gerade gespielt wird und
die Anzahl der Runden, die insgesamt gespielt werden. Die Funktion gibt
einen String zurück, in dem beide Informationen enthalten sind.

::: pyconsole
show_round_number(1, 3) show_round_number(4, 5)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion wird die Nummer eines
Spielers als Integer übergeben. Sie gibt einen String zurück, indem der
Spieler begrüßt und nach seinem Namen gefragt wird.

::: pyconsole
greet_player_ask_name_helper(1) greet_player_ask_name_helper(2)
:::
::::

# Ausgabe

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion werden die aktuelle
Rundenzahl und die Anzahl der Runden die insgesamt gespielt werden als
Integer übergeben. Sie gibt beide Informationen an der Konsole aus.

::: pyconsole
print_round_number(1, 5) print_round_number(1, 1)
:::
::::

# Bedingungen

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion wird eine Punktezahl als
Integer übergeben. Sie gibt zurück wenn die Zahl $0$ oder größer als
eins ist. Wenn die Zahl $1$ ist, gibt sie zurück.

::: pyconsole
point_or_points(1) point_or_points(4)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion wird ein Name als String
und eine Punktezahl als Integer übergeben. Sie gibt einen String zurück,
in dem steht wie viele Punkte die Person hat.

::: pyconsole
show_player_points(\"Kevin\", 1) show_player_points(\"Barbara\", 3)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser werden die Eingaben der beiden
Spieler als Strings übergeben. Sie gibt zurück, wer die Runde gewonnen
hat. Die einzigen möglichen Argumente sind , und . Die einzigen
möglichen Rückgabewerte sind , und .

![<https://upload.wikimedia.org/wikipedia/commons/6/67/Rock-paper-scissors.svg>](rock-paper-scissors){width="50%"}

::: pyconsole
compute_round_winner(\"rock\", \"scissors\")
compute_round_winner(\"rock\", \"paper\") compute_round_winner(\"rock\",
\"rock\")
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion werden die Punktezahlen
der beiden Spieler als Integer übergeben. Sie gibt einen String zurück,
in dem steht, wer das gesamte Spiel gewonnen hat. Die einzigen möglichen
Rückgabewerte sind , und .

::: pyconsole
compute_game_winner(1, 5) compute_game_winner(3, 2)
compute_game_winner(3, 3)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion wird der Gewinner einer
Runde / eines Spiels und die Namen der Spieler übergeben. Wenn es einen
Gewinner gibt, gibt sie seinen Namen zurück Ansonsten wird
zurückgegeben. Die einzigen Möglichkeiten für das erste Argument sind ,
und .

::: pyconsole
result_to_name(\"1\", \"John\", \"Ringo\") result_to_name(\"2\",
\"Mick\", \"Keith\") result_to_name(\"Nobody\", \"Ringo\", \"George\")
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser wird ein Boolean Übergeben. Wenn
dieses ist, gibt sie zurück. Ansonsten gibt sie zurück.

::: pyconsole
round_or_game(True) round_or_game(False)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser wird ein Name und Boolean
übergeben. Wenn übergeben wird, gibt die Funktion einen String zurück,
in dem steht, dass die Person mit diesem Namen das Spiel gewonnen hat.
Ansonsten steht in dem String, dass die Person die Runde gewonnen hat.

::: pyconsole
show_round_or_game_winner(\"John\", True)
show_round_or_game_winner(\"Paul\", False)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser wird übergeben, wer das Spiel/die
Runde gewonnen hat. Die einzigen Möglichkeiten sind , und . Außerdem
werden die Namen der Spieler und ein Boolean übergeben. Wenn dieses ist
soll als String zurückgegeben werden welcher Spieler, das Spiel gewonnen
hat. Ansonsten wird zurückgegeben welcher Spieler die Runde gewonnen
hat. In dem String werden die übergebenen Namen verwendet.

::: pyconsole
show_winner_with_name_helper(\"1\", \"Grace\", \"Alan\", True)
show_winner_with_name_helper(\"2\", \"Grace\", \"Alan\", False)
show_winner_with_name_helper(\"Nobody\", \"Grace\", \"Alan\", False)
:::
::::

:::: aufgabe
eine Funktion . Dieser wird übergeben wer das Spiel gewonnen hat. Die
einzigen Möglichkeiten sind , und . Außerdem werden die Namen der
Spieler übergeben. Die Funktion gibt einen String zurück in dem steht,
wer die Runde gewonnen hat. In dem String wird der Name des Spielers
verwendet.

::: pyconsole
show_round_winner_with_name(\"1\", \"Grace\", \"Alan\")
show_round_winner_with_name(\"2\", \"Grace\", \"Alan\")
show_round_winner_with_name(\"Nobody\", \"Grace\", \"Alan\")
:::
::::

:::: aufgabe
eine Funktion . Dieser werden Namen der Spieler als Strings und ihre die
Punktezahlen als Integer übergeben. Die Funktion gibt einen String
zurück in dem steht, wer das Spiel gewonnen hat.

::: pyconsole
show_game_winner_with_name(\"Grace\", \"Alan\", 1, 2)
show_game_winner_with_name(\"Grace\", \"Alan\", 5, 0)
show_game_winner_with_name(\"Grace\", \"Alan\", 1 , 1)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser wird der Gewinner der letzten
Runde, die Nummer eines Spielers und die Punktzahl des Spielers mit
dieser Nummer übergeben. Die einzigen Möglichkeiten für das erste
Argument sind , und . Die Funktion gibt die neue Punktzahl des Spielers
zurück.

::: pyconsole
compute_new_points(\"1\", 1, 3) compute_new_points(\"2\", 1, 3)
compute_new_points(\"Nobody\", 1, 1)
:::
::::

# Ausgabe

:::: aufgabe
Schreibe eine Funktion . Diese funktioniert genau wie . Sie gibt den
Strings aber an der Konsole aus und nicht zurück.

::: pyconsole
print_round_winner_with_name(\"1\", \"Grace\", \"Alan\")
print_round_winner_with_name(\"2\", \"Grace\", \"Alan\")
print_round_winner_with_name(\"Nobody\", \"Grace\", \"Alan\")
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion werden zwei Spielernamen
als Strings und deren Punktezahl als Integer übergeben. Sie gibt an der
Konsole aus welcher Spieler wie viele Punkte hat.

::: pyconsole
print_players_points(\"Kevin\", \"Barbara\", 1, 5)
print_players_points(\"Ali\", \"Maria\", 1, 5)
:::
::::

:::: aufgabe
Implementiere eine Funktion . Dieser Funktion werden zwei Spielernamen
als Strings und deren Punktezahl als Integer übergeben. Sie gibt das
Endergebniss an der Konsole aus.

::: pyconsole
print_game_winner_with_name(\"Kevin\", \"Barbara\", 1, 5)
print_game_winner_with_name(\"Ali\", \"Maria\", 6, 5)
print_game_winner_with_name(\"Ali\", \"Maria\", 6, 6)
:::
::::

# Eingabe

::: aufgabe
Implementiere eine Funktion . Der Funktion wird eine Spielernummer als
Integer übergeben. Sie fordert den Spieler dazu auf seinen Namen an der
Konsole einzugeben. Der Name wird anschließend zurückgegeben.

![image](greet_player_ask_name){width="80%"}
:::

::: aufgabe
Schreibe eine Funktion , die fragt wie viele Runden gespielt werden
sollen. Diese Eingabe wird als Integer zurückgegeben.

![image](ask_rounds){width="80%"}
:::

::: aufgabe
Implementiere eine Funktion . Der Funktion wird eine Spielername als
String übergeben. Sie fordert die Spielerin dazu auf Schere, Stein oder
Papier einzugeben. Die Auswahl wird als String zurückgegeben.

![image](greet_player_ask_choice){width="80%"}
:::

::: aufgabe
Implementiere eine Funktion . Dieser Funktion werden die aktuelle
Rundenzahl und die Zahl der Runden, die gespielt werden, übergeben. Sie
gibt diese beiden Informationen in der Konsole aus. Der Funktion werden
auch die Namen der Spieler übergeben. Sie spricht die Spieler mit ihren
Namen an und bittet sie Schere, Stein oder Papier einzugeben. Das
Ergebnis dieser Runde wird anschließend aus- und gegeben. Hierbei wird
der Name des Gewinners genutzt.

Es wird auch zurückgegeben, wer gewonnen hat. Die einzig möglichen
Rückgabewerte sind , und .

![image](play_one_round){width="80%"}
:::

::: aufgabe
Implementiere eine Funktion . Diese Funktion werden die Anzahl der
Runden, die gespielt werden und die Namen der Spieler übergeben. Sie
spielt das Spiel unter diesen Bedingungen.

Nachdem alle Runden gespielt wurden, wird das Endergebnis ausgegeben.\

![image](play_rps_helper){width="80%"}
:::

::: aufgabe
Implementiere eine Funktion . Diese Funktion fragt zwei Spieler nach
ihren Namen. Anschließend fragt sie wie viele Runden gespielt werden
sollen. Danach wird das Spiel mit diesen Einstellungen durchgeführt.\

![image](play_rps){width="80%"}
:::

::: aufgabe
Nutze das Kontrollzeichen im Code um bei der Ausgabe Zeilen zu
überspringen.
:::

# Verbesserungen

# While-Schleifen

::: aufgabe
Implementiere eine Funktion , die den Benutzer solange auffordert etwas
einzugeben, bis die Eingabe , oder ist. Diese Eingabe wird dann
zurückgegeben.

![image](while_input){width="\\linewidth"}
:::

:::: aufgabe
Implementiere eine Funktion , die eine Zahl als String und zwei Zahlen
als Integer übergeben bekommt. Die Funktion prüft, ob die erste Zahl
zwischen den beiden anderen Zahlen liegt. Gehe davon aus, dass das
zweite Integer größer ist, als das erste Integer.

::: pyconsole
is_in_interval(\"4\", 1 , 2) is_in_interval(\"3\", 1 , 3)
is_in_interval(\"5\", 5 , 7)
:::
::::

::: aufgabe
Implementiere eine Funktion , die zwei Zahlen als Integer übergeben
bekommt. Die Funktion fordert die Benutzerin auf eine Rundenzahl
zwischen diesen beiden Zahlen einzugeben und fragt solange nach, bis die
Eingabe korrekt war.
:::

![image](get_correct_round_counter){width="\\linewidth"}

::: aufgabe
Bau diese Funktionen in das vollständige Programm ein!
:::
