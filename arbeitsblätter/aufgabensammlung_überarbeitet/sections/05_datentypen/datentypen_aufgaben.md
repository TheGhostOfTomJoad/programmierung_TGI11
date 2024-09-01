---
title: Datentypen 
codebraid:
  jupyter: true
---

```{.kotlin .cb-run}

val twoString = "2"

val times = " * "

val computation2Power2 = twoString + times + twoString

val computation2Power4 = computation2Power2 + times + computation2Power2

val computation2Power8 = computation2Power4 + times + computation2Power4

val computation2Power16 = computation2Power8 + times + computation2Power8

val two = 2

val twoPower2 = two * two

val twoPower4 = twoPower2 * twoPower2

val twoPower8 = twoPower4 * twoPower4

val twoPower16 = twoPower8 * twoPower8

val twoPower16ComputationWithResult = computation2Power16 + " = " + twoPower16.toInt()

twoPower16ComputationWithResult



fun ToIntEmptyToZero(number: String) = ("0"+ number).toInt()

fun sumStr(a:String, b: String) = (ToIntEmptyToZero(a) + ToIntEmptyToZero(b)).toString()

```
# Datentypen

## Aufgabe
Erstelle eine Variable `twoPower16ComputationWithResult`{.kotlin} mit dem
folgenden Inhalt:

``` {.kotlin .cb-nb first_number=1}
twoPower16ComputationWithResult
```

Nutze dabei die Aufgaben aus den vorherigen Kapiteln.


## Aufgabe
### Teilaufgabe

Implementiere eine Funktion `toIntEmptyToZero`{.kotlin}. Dieser Funktion
wird ein String übergeben, den sie als Integer zurückgibt. Wenn der
leere String übergeben wird, gibt sie Null `0`{.kotlin} zurück.

### Teilaufgabe

Implementiere eine Funktion `sumStr`{.kotlin}, die zwei Zahlen als
Strings übergeben bekommt und die Summe der Zahlen als String
zurückgibt. Der leere String soll als Null gewertet werden.

```{.kotlin .cb-nb first_number=1}
sumStr("1", "2")
```

```{.kotlin .cb-nb first_number=1}
sumStr("", "2")
```
```{.kotlin .cb-nb first_number=1}
sumStr("", "2")
```
```{.kotlin .cb-nb first_number=1}
sumStr("", "")
```

<https://www.codewars.com/kata/5966e33c4e686b508700002d/kotlin>


<!-- ## Aufgabe
Implementiere eine Funktion `toTime`{.kotlin}, die eine Zeit in Sekunden
übergeben bekommt und zurückgibt, wie viele Stunden und Minuten dieser
Zeitangabe entsprechen. Übrige Sekunden werden ignoriert.

``` {.kotlin .cb-nb first_number=1}
toTime(3600)
toTime(3601)
toTime(4567)
```

<https://www.codewars.com/kata/5865cff66b5699883f0001aa/train/kotlin> -->
