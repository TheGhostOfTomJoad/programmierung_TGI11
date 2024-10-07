---
title: Funktionen und Strings 
codebraid:
  jupyter: true
---

``` {.kotlin .cb-run first_number=1}
fun sayHello(name: String): String = "Hello, " + name
fun greet(name: String): String = "Hello, " + name + " how are you doing today?"

fun combineNames(firstName: String, lastName: String) =  firstName + " " +
lastName
```

# Funktionen und Strings

## Aufgabe
Implementiere eine Funktion `sayHello`{.kotlin}, die einen Namen als
String übergeben bekommt und eine Begrüßung an die Person zurückgibt.

``` {.kotlin .cb-nb first_number=1}
sayHello("Ada")
```
``` {.kotlin .cb-nb first_number=1}
sayHello("Alan Turing")
```

<!-- <https://www.codewars.com/kata/5625618b1fe21ab49f00001f/train/kotlin> -->


## Aufgabe
Implementiere eine Funktion `greet`{.kotlin}, die einen Namen als String
übergeben bekommt und eine freundlichere Begrüßung an die Person
zurückgibt.

``` {.kotlin .cb-nb first_number=1}
greet("Ina")
```
``` {.kotlin .cb-nb first_number=1}
greet("Grace hopper")
```

<https://www.codewars.com/kata/55a70521798b14d4750000a4/train/kotlin>


## Aufgabe
Implementiere eine Funktion `combineNames`{.kotlin}, die Vor- und
Nachnamen einer Person als Strings übergeben bekommt und den vollen
Namen der Person zurückgibt.

``` {.kotlin .cb-nb first_number=1}
combineNames("Alan", "Turing")
```
``` {.kotlin .cb-nb first_number=1}
combineNames("Grace", "Hopper")
```

<!-- <https://www.codewars.com/kata/55f73f66d160f1f1db000059/train/kotlin> -->

