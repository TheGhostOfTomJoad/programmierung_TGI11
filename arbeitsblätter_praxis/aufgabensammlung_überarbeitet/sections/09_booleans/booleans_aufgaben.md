---
title: Booleans 
codebraid:
  jupyter: true
---

```{.kotlin .cb-run first_number=1}
fun setAlarm(employed: Boolean, vacation: Boolean) : Boolean = employed && ! vacation

fun xor(a: Boolean, b: Boolean) : Boolean = (a && ! b) || (! a && b)

fun xor2(a: Boolean, b: Boolean) : Boolean = a != b


fun hero(bulletsAvailable: Int, dragons: Int) : Boolean = bulletsAvailable >= 2 * dragons

fun hero2(bulletsAvailable: Int, dragons: Int) : Boolean {
    val bulletsNeeded = 2 * dragons
    return bulletsNeeded >= bulletsAvailable
}

fun isTriangle(a: Int, b: Int, c: Int) = a < b + c && b < a + c && c < a + b

fun zeroFuel(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean = mpg * fuelLeft >= distanceToPump

fun zeroFuel2(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean {
    val distancePossible = mpg * fuelLeft
    return distancePossible >= distanceToPump
}


fun checkForFactor(base: Int, factor: Int) = base % factor == 0

fun loveFun(flowerA: Int, flowerB: Int): Boolean = flowerA % 2 != flowerB % 2

fun isLeapYear(year: Int) : Boolean {
  return year % 4 == 0 &&  year % 100 != 0  || year % 400 == 0
}

```

# Booleans

## Vergleiche

### Aufgabe
Ein Held ist auf dem Weg zu einem Schatz, der von Drachen beschützt
wird. Um einen Drachen zu besiegen braucht er zwei Kugeln. Hat er zu
wenige Kugeln wird er von den Drachen gefressen. Implementiere eine
Funktion `hero`{.kotlin}, die zwei Parameter vom Typ *Integer* hat. Der
erste Parameter ist die Anzahl der Kugeln, die der Held dabei hat und
der zweite Parameter ist die Anzahl de Drachen. Die Funktion soll
zurückgeben, ob der Held überlebt.



``` {.kotlin .cb-nb first_number=1}
hero(10, 5)
```
```{.kotlin .cb-nb first_number=1}
hero(7, 4)
```

<https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/kotlin>\


### Aufgabe
Implementiere eine Funktion `zeroFuel`{.kotlin}, die dir hilft, zu
berechnen, ob du es mit einem Auto und dem übrigen Benzin bis zur
nächsten Tankstelle schaffst. Diese Funktion hat drei Parameter vom Typ
*Integer*. Dabei handelt es sich um die Entfernung zur Tankstelle in
Kilometern, die Kilometeranzahl, die mit einem Liter Benzin gefahren
werden können und die übrige Tankfüllung in Litern. Sie gibt zurück, ob
du es bis zur nächsten Tankstelle schaffst.

``` {.kotlin .cb-nb first_number=1}
zeroFuel(50, 25, 2)
```
```{.kotlin .cb-nb first_number=1}
zeroFuel(100, 50, 1)
```

<!-- <https://www.codewars.com/kata/5861d28f124b35723e00005e/train/kotlin> -->


## Verknüpfungen

### Aufgabe
Implementiere eine Funktion `setAlarm`{.kotlin}, die zurückgibt, ob ein
Wecker gestellt werden muss. Die Funktion hat zwei Parameter vom Typ
*Bool* (die Typannotation ist `bool`{.kotlin}). Der erste Parameter gibt
an ob eine Person angestellt ist. Der zweite Parameter gibt an, ob die
Person gerade Urlaub hat. Die Funktion soll genau dann `true`{.kotlin}
zurückgeben, wenn die Person angestellt ist und gerade keinen Urlaub
hat. Ansonsten muss Sie sich keinen Wecker stellen.

<!-- <https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/kotlin>\ -->


``` {.kotlin .cb-nb first_number=1}
setAlarm(true, false)
```
```{.kotlin .cb-nb first_number=1}
setAlarm(true, true)
```

### Aufgabe
Implementiere eine Funktion `isTriangle`{.kotlin} die drei Parameter vom
Typ *Integer* hat und zurückgibt, ob es ein Dreieck mit diesen
Seitenlängen gibt.

``` {.kotlin .cb-nb first_number=1}
isTriangle(1, 1, 30)
```
```{.kotlin .cb-nb first_number=1}
isTriangle(1, 2, 3)
```
```{.kotlin .cb-nb first_number=1}
isTriangle(5, 5 ,7)
```

Es gibt genau dann ein Dreieck mit den angegeben Seitenlängen, wenn jede Seite kürzer ist als die Summe der beiden anderen Seiten.


<!-- <https://www.codewars.com/kata/56606694ec01347ce800001b/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `xor`{.kotlin} die zwei Parameter vom Typ
*Bool* hat und zurückgibt, ob genau ein Argument `true`{.kotlin} ist.

``` {.kotlin .cb-nb first_number=1}
xor(true, true)
```
```{.kotlin .cb-nb first_number=1}
xor(true, false)
```
```{.kotlin .cb-nb first_number=1}
xor(false, false)
```

<!-- <https://www.codewars.com/kata/56fa3c5ce4d45d2a52001b3c/train/kotlin>\ -->


### Aufgabe
Implementiere eine Funktion `checkForFactor`{.kotlin}, die zwei ganze
Zahl übergeben bekommt und zurückgibt, ob die zweite Zahl ein Teiler der
ersten Zahl ist.

``` {.kotlin .cb-nb first_number=1}
checkForFactor(12, 3)
```
```{.kotlin .cb-nb first_number=1}
checkForFactor(11, 2)
```

<https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/kotlin>


### Aufgabe

Schreibe eine Funktion `loveFun`{.kotlin}, die zwei ganze
Zahl übergeben bekommt und prüft, ob genau eine der Zahlen gerade ist.

``` {.kotlin .cb-nb first_number=1}
loveFun(4, 5)
```
```{.kotlin .cb-nb first_number=1}
loveFun(3,5)
```
```{.kotlin .cb-nb first_number=1}
loveFun(4,6)
```



<https://www.codewars.com/kata/555086d53eac039a2a000083/train/kotlin>

### Aufgabe

Schreibe eine Funktion `leapYear`{.kotlin}, die prüft ob ein gegebens Jahr ein Schalctjahr ist.

- Alle durch 4 teilbaren Jahre sind Schaltjahre, bis auf die folgende Ausnahme:
- Ein durch 100 teilbares Jahr ist kein Schlatjahr, bis auf die folgende Ausnahme:
- Ein durch 400 teilbares Jahr ist ein Schaltjahr 

``` {.kotlin .cb-nb first_number=1}
isLeapYear(95)
```
``` {.kotlin .cb-nb first_number=1}
isLeapYear(96)
```
```{.kotlin .cb-nb first_number=1}
isLeapYear(100)
```
```{.kotlin .cb-nb first_number=1}
isLeapYear(400)
```

<https://www.codewars.com/kata/526c7363236867513f0005ca/train/kotlin>