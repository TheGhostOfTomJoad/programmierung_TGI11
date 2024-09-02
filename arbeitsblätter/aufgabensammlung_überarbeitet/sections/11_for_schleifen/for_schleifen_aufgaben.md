---
title: For-Schleifen 
codebraid:
  jupyter: true
---


``` {.kotlin .cb-run first_number=1}

fun printSquares0_10(): Unit {
    for (i in 0..10) {
        println(i * i)
    }
}

fun printSquares(n: Int) {
    for (i in 0..n - 1) {
        println(i * i)
    }
}


fun printSquaresNicer(n: Int) {
    println("The first " + n.toString() + " squares are:")
    for (i in 0..n - 1) {
        println(i * i)
    }
    println("Goodbye")
}


fun printSquaresStartEnd(lower: Int, upper: Int): Unit {
    println("The square of the numbers from " + lower.toString() + " up to " + upper.toString() + " are:")
    for (i in lower..upper) {
        println(i * i)
    }
    println("Goodbye")
}

fun printSquaresStartEndPretty(lower: Int, upper: Int): Unit {
    println("The square of the numbers from " + lower.toString() + " up to " + upper.toString() + " are:")
    for (i in lower..upper) {
        println(i.toString() + " * " + i.toString() + " = " + (i * i).toString())
    }
    println("Goodbye")
}

fun summation(n: Int): Int {
    var acc = 0
    for (i in 1..n) {
        acc = acc + i
    }
    return acc
}

fun factorial(n: Int): Int {
    var acc = 1
    for (i in 1..n) {
        acc = acc * i
    }
    return acc
}

fun numberToPwr(number: Int, p: Int): Int {
    var acc = 1
    for (i in 1..p) {
        acc = acc * number
    }
    return acc
}

fun countSheep(n: Int): String {
    var acc = ""
    for (i in 1..n) {
        acc = acc + i + " sheep..."
    }
    return acc
}

fun sumCubes(n: Int): Int {
    var acc = 0
    for (i in 1..n) {
        acc = acc + i * i * i
    }
    return acc
}

fun min(x: Int, y: Int): Int = if (x > y) y else x
fun max(x: Int, y: Int): Int = if (x > y) x else y


fun getSum(a: Int, b: Int): Int {
    val upper = max(a, b)
    val lower = min(a, b)
    var acc = 0
    for (i in lower..upper) {
        acc = acc + i
    }
    return acc
}

fun choose(n: Int, k: Int): Int = if (k > n) 0 else factorial(n) / (factorial(n - k) * factorial(k))

fun solution(number: Int): Int {
    var acc = 0
    for (i in 1..number - 1) {
        if (i % 3 == 0 || i % 5 == 0) {
            acc = acc + i
        }
    }
    return acc
}

fun divisors(n: Int): Int {
    var acc = 0
    for (i in 1..n) if (n % i == 0) {
        acc = acc + 1
    }
    return acc
}

fun isPrime(n: Int): Boolean = divisors(n) == 2

fun sumDivisors(n: Int): Int {
    var acc = 0
    for (i in 1..n - 1) if (n % i == 0) {
        acc = acc + i
    }
    return acc
}

fun isPerfect(n: Int): Boolean = sumDivisors(n) == n

fun amicableNumbers(n1: Int, n2: Int): Boolean = n1 != n2 && sumDivisors(n1) == n2 && sumDivisors(n2) == n1

fun abundantNumber(n: Int): Boolean = sumDivisors(n) > n

fun nthFib(n: Int): Int {
    var a = 0
    var b = 1
    for (i in 1..n) {
        val temp = b
        b = a + b
        a = temp
    }
    return a
}
```
# For-Schleifen

## Wiederholte Ausgabe

### Aufgabe
Implementiere eine Funktion `printSquares0_10`{.kotlin}. Sie gibt die
Quadrate der Zahlen von $0$ bis $10$ an der Konsole aus.

``` {.kotlin .cb-nb first_number=1}
printSquares0_10()
```


### Aufgabe
Implementiere eine Funktion `printSquares`{.kotlin}. Dieser wird eine
positive Zahl $n$ übergeben. Sie gibt die ersten $n$ Quadratzahlen an
der Konsole aus.

``` {.kotlin .cb-nb first_number=1}
printSquares(5)
```


### Aufgabe
Implementiere eine Funktion `printSquaresNicer`{.kotlin}. Dieser wird
eine positive Zahl $n$ übergeben. Sie kündigt zuerst an, wie viele
Quadratzahlen sie ausgeben wird. Nach der Ausgabe dieser Quadratzahlen
verabschiedet sie sich von dem Benutzer.

``` {.kotlin .cb-nb first_number=1}
printSquaresNicer(5)
```


### Aufgabe
Implementiere eine Funktion `printSquaresStartEnd`{.kotlin}. Dieser
werden zwei positive Zahlen $m$ und $n$ übergeben. Sie gibt die Quadrate
der Zahlen von $m$ bis $n$ aus. Die Funktion gibt zunächst an welche
Quadratzahlen sie ausgibt. Nach der Ausgabe dieser Quadratzahlen
verabschiedet sie sich von dem Benutzer.

``` {.kotlin .cb-nb first_number=1}
printSquaresStartEnd(5, 7)
```


### Aufgabe
Erweitere die Funktion aus der letzten Aufgabe zu einen Funktion
`printSquaresStartEndPretty`{.kotlin} so, dass in jedem Schritt auch die
Rechnung angezeigt wird.


``` {.kotlin .cb-nb first_number=1}
printSquaresStartEndPretty(5, 7)
```

## Akkumulator-Pattern

### Aufgabe
Implementiere eine Funktion `summation`{.kotlin}. Dieser wird eine
positive Zahl $n$ übergeben. Sie berechnet die Summe der Zahlen von $1$
bis $n$. Es gilt z.B.
$\mathtt{summation} (\mathtt{3}) = \mathtt{1} + \mathtt{2} + \mathtt{3}$
und allgemein:
$\mathtt{summation} (\mathtt{n}) =  \mathtt{1} + \dots \mathtt{n}$.

``` {.kotlin .cb-nb first_number=1}
summation(1)
```
``` {.kotlin .cb-nb first_number=1}
summation(3)
```
``` {.kotlin .cb-nb first_number=1}
summation(5)
```
<https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/kotlin>


### Aufgabe
Implementiere eine Funktion `numberToPwr`{.kotlin}, mit der Potenzen
berechnet werden können. Der Funktion wird die Basis und die Hochzahl
übergeben. Sie gibt die berechnete Potenz zurück. Beispiel:
$$\mathtt{numberToPWR} (\mathtt{2, 3}) =  \mathtt{2 \cdot 2  \cdot 2}$$

``` {.kotlin .cb-nb first_number=1}
numberToPwr(3, 1)
```
``` {.kotlin .cb-nb first_number=1}
numberToPwr(2, 3)
```
``` {.kotlin .cb-nb first_number=1}
numberToPwr(3, 3)
```
<!-- 
<https://www.codewars.com/kata/562926c855ca9fdc4800005b/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `factorial`{.kotlin}. Dieser wird eine
positive Zahl $n$ übergeben. Sie berechnet das Produkt der Zahlen von
$1$ bis $n$. Es gilt z.B.
$\mathtt{factorial} (\mathtt{3}) = \mathtt{1} * \mathtt{2} *  \mathtt{3}$
und allgemein:
$\mathtt{factorial} (\mathtt{n}) =  \mathtt{1} * \dots \mathtt{n}$. Das
leere Produkt (mit null Faktoren) ergibt Eins.

``` {.kotlin .cb-nb first_number=1}
factorial(0)
```
``` {.kotlin .cb-nb first_number=1}
factorial(1)
```
``` {.kotlin .cb-nb first_number=1}
factorial(3)
```

<!-- <https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `choose`{.kotlin}. Dieser werden zwei ganze
Zahlen $N$ und $k$ übergeben. Sie gibt zurück, wie viele Möglichkeiten
es gibt $k$ Elemente aus $N$ Elementen auszuwählen. Solange $k$ nicht
größer ist als $N$ kann man für die Berechnung Binomialkoeffizienten
nutzen.

$$\binom{N}{k} = \frac{n!}{k! \cdot (n - k)!}$$

``` {.kotlin .cb-nb first_number=1}
choose(1, 1)
```
``` {.kotlin .cb-nb first_number=1}
choose(3, 2)
```
``` {.kotlin .cb-nb first_number=1}
choose(5, 10)
```

<!-- <https://www.codewars.com/kata/55b22ef242ad87345c0000b2/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `countSheep`{.kotlin}, die beim Einschlafen
hilft. Dieser wird eine natürliche Zahl $n$ übergeben. Sie gibt einen
String zurück in dem entsprechend viele Schafe gezählt werden.

``` {.kotlin .cb-nb first_number=1}
countSheep(0)
```
``` {.kotlin .cb-nb first_number=1}
countSheep(1)
```
``` {.kotlin .cb-nb first_number=1}
countSheep(3)
```

<!-- <https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `sumCubes`{.kotlin}. Dieser wird eine
positive Zahl $n$ übergeben. Sie berechnet Summe der ersten $n$
Kubikzahlen. Es gilt z.B.
$\mathtt{sumCubes} (\mathtt{3}) = \mathtt{1^{3} + 2 ^{3} + 3^{3}}$ und
allgemein:
$\mathtt{sumCubes} (\mathtt{n}) =  \mathtt{1^{3}} + \dots \mathtt{n^{3}}$.

``` {.kotlin .cb-nb first_number=1}
sumCubes(1)
```
``` {.kotlin .cb-nb first_number=1}
sumCubes(2)
```
``` {.kotlin .cb-nb first_number=1}
sumCubes(3)
```

<!-- <https://www.codewars.com/kata/59a8570b570190d313000037/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `getSum`{.kotlin}. Dieser werden zwei ganze
Zahlen übergeben. Sie gibt die Summe aller Zahlen dazwischen
einschließlich der beiden Zahlen zurück. Es gilt z.B.
$\mathtt{getSum} (\mathtt{3, \. 1}) = \mathtt{1 + 2 + 3}$

``` {.kotlin .cb-nb first_number=1}
getSum(1, 2)
```
``` {.kotlin .cb-nb first_number=1}
getSum(3, 1)
```

<!-- <https://www.codewars.com/kata/55f2b110f61eb01779000053/train/kotlin> -->


### Aufgabe
Nutze `for`{.kotlin}-Schleifen um eine Funktion `nthFib`{.kotlin} zu
schreiben, mit der die $n$-te Fibonacci-Zahl berechnet werden kann. Die
ersten beiden Fibonacci-Zahlen sind $0$ und $1$. Jede weitere
Fibonacci-Zahl ist die Summe ihrer beiden Vorgänger.

``` {.kotlin .cb-nb first_number=1}
nthFib(1)
```
``` {.kotlin .cb-nb first_number=1}
nthFib(2)
```
``` {.kotlin .cb-nb first_number=1}
nthFib(3)
```
``` {.kotlin .cb-nb first_number=1}
nthFib(4)
```

<!-- <https://www.codewars.com/kata/522551eee9abb932420004a0/train/kotlin> -->


### Aufgabe
Implementiere eine Funktion `solution`{.kotlin}. Dieser wird eine ganze
Zahl $n$ übergeben. Sie gibt die Summe der Vielfache von $3$ oder $5$,
die kleiner als diese Zahl sind, zurück.

``` {.kotlin .cb-nb first_number=1}
solution(6)
```
``` {.kotlin .cb-nb first_number=1}
solution(3)
```

<https://www.codewars.com/kata/514b92a657cdc65150000006/train/kotlin>


### Aufgabe
Implementiere eine Funktion `divisors`{.kotlin}. Dieser wird eine ganze
Zahl $n$ übergeben. Sie gibt die Anzahl der Teiler dieser Zahl zurück.
Die Zahl $4$ hat die Teiler $1, 2$ und $4$. Also gilt
$\mathtt{divisors(4) = 3}$.

``` {.kotlin .cb-nb first_number=1}
divisors(4)
```
``` {.kotlin .cb-nb first_number=1}
divisors(5)
```

<!-- <https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/kotlin> -->


### Aufgabe
Eine Primzahl ist eine natürliche Zahl größer Eins, die nur durch eins
und sich selbst teilbar ist. Implementiere eine Funktion
`isPrime`{.kotlin}. Dieser wird eine ganze Zahl $n$ übergeben. Sie gibt
die zurück, ob die Zahl eine Primzahl ist.

``` {.kotlin .cb-nb first_number=1}
isPrime(6)
```
``` {.kotlin .cb-nb first_number=1}
isPrime(7)
```

<!-- <https://www.codewars.com/kata/53daa9e5af55c184db00025f/train/kotlin> -->


### Aufgabe
Eine natürliche Zahl ist perfekt, wenn die Summe ihrer echten Teiler
(bis auf sie selbst) genau die Zahl ergibt. Z.B. gilt $1 + 2 + 3 = 6$.
Also ist $6$ eine perfekte Zahl. Implementiere eine Funktion
`isPerfect`{.kotlin}. Dieser wird eine ganze Zahl $n$ übergeben. Sie
gibt die zurück, ob die Zahl perfekt ist.

``` {.kotlin .cb-nb first_number=1}
isPerfect(6)
```
``` {.kotlin .cb-nb first_number=1}
isPerfect(7)
```

<!-- <https://www.codewars.com/kata/56a28c30d7eb6acef700004d/train/kotlin> -->


### Aufgabe
Eine natürliche Zahl ist abundant(überladen), wenn die Summe ihrer
echten Teiler (bis auf sie selbst) größer als die Zahl selbst ist. Z.B.
ist $12$ eine abundante Zahl, da die echten Teiler von $12$ die Zahlen
$1, 2, 3,  4$ und $6$ sind. Deren Summe $16$ ist größer als $12$.

Implementiere eine Funktion `abundantNumber`{.kotlin}, die prüft, ob
eine natürliche Zahl abundant ist.

``` {.kotlin .cb-nb first_number=1}
abundantNumber(12)
```
``` {.kotlin .cb-nb first_number=1}
abundantNumber(7)
```

<!-- <https://www.codewars.com/kata/56a75b91688b49ad94000015/train/kotlin> -->


### Aufgabe
Zwei natürliche Zahl sind befreundet, wenn sie verschieden sind und die
Summe ihrer Teiler jeweils der anderen Zahl entspricht. Z.B. sind $220$
und $284$ befreundet. Die Teiler von $220$ sind
$1, 2, 4, 5, 10, 11, 20, 22, 44, 55$ und $110$. Die Summe dieser Zahlen
ist $284$.

Die Teiler von $284$ sind $1, 2, 4, 71$ und $142$. Deren Summe ist
$220$. Implementiere eine Funktion `amicableNumbers`{.kotlin}, die prüft
ob zwei Zahlen befreundet sind.

``` {.kotlin .cb-nb first_number=1}
amicableNumbers(220, 284)
```
``` {.kotlin .cb-nb first_number=1}
amicableNumbers(10, 11)
```

<!-- <https://www.codewars.com/kata/56b5ebaa26fd54188b000018/train/kotlin> -->

<!-- 
### Aufgabe
Implementiere eine schnellere Version von `isPrime`{.kotlin}. Überlege
dir dafür wie groß die echten Teiler einer Zahl maximal sein können.

<https://www.codewars.com/kata/5262119038c0985a5b00029f/train/kotlin>
 -->
