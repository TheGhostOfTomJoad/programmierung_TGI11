---
title: Strings als Container 
codebraid:
  jupyter: true
---

``` {.kotlin .cb-run first_number=1}

fun noSpace(s: String): String {
    var acc = ""
    for (char in s) {
        if (char != ' ') {
            acc = acc + char
        }
    }
    return acc
}

fun contamination(text: String, new_char: Char): String {
    var acc = ""
    for (char in text) {
        acc =
            acc + new_char
    }
    return acc
}

fun doubleChar(s: String): String {
    var acc = ""
    for (char in s) {
        acc = acc + char + char
    }
    return acc
}

fun isVowel(char: Char) = char == 'a' || char == 'e' || char ==
        'i' || char == 'o' || char == 'u' || char == 'A' || char ==
        'E' || char == 'I' || char == 'O' || char == 'U'

fun getCount(str : String) : Int {
    var acc = 0
    for (char in str){acc = acc + if (isVowel(char)) 1 else 0 }
    
    return acc
}


fun disemvowel(s: String): String {
    var acc = ""
    for (char in s) {
        if (!isVowel(char)) {
            acc = acc + char
        }
    }
    return acc
}

fun moveVowels(input: String): String {
    var not_vowels = ""
    var vowels = ""
    for (char in input) if (isVowel(char)) {
        vowels = vowels + char
    } else {
        not_vowels =
            not_vowels + char
    }
    return not_vowels + vowels
}

fun sumDigits(number: String): Int {
    var acc = 0
    for (digit in number.toString()) {
        if (digit != '-') {
            acc = acc + digit.toInt()
        }
    }
    return acc
}

fun removeChar(str: String): String {
    var acc = ""
    for (i in 1..str.length - 2) {acc = acc + str[i]}
    return acc
}

fun replace(s: String): String {
    var acc = ""
    for (char in s){
        if (isVowel(char)){acc = acc + "!"} else {acc = acc + char}
        
    }
    return acc
}

fun makeComplement(dna : String) : String {
    var acc = ""
    for (char in dna){
        acc = acc + when {
            char == 'A' -> 'T'
            char == 'T' -> 'A'
            char == 'C' -> 'G'
            char == 'G' -> 'C'
            else  -> char
        }
    }
    return acc

}

```

# Strings als Container

## Aufgabe
Schreibe eine Funktion `doubleChar`{.kotlin}. Dieser wird ein String
übergeben. Sie gibt einen String zurück, in dem alle Buchstaben im
ursprünglichen String verdoppelt wurden.

``` {.kotlin .cb-nb first_number=1}
doubleChar("Hello")
```
``` {.kotlin .cb-nb first_number=1}
doubleChar("Bye")
```

<!-- <https://www.codewars.com/kata/56b1f01c247c01db92000076/train/kotlin> -->

## Aufgabe
Schreibe eine Funktion `contamination`{.kotlin}. Dieser werden ein
String und ein einzelner Buchstabe als String übergeben. Sie gibt einen
String zurück, in dem alle Buchstaben im ursprünglichen String durch den
übergebenen Buchstaben ersetzt wurden.

``` {.kotlin .cb-nb first_number=1}
contamination("fadsf adfasdf", ' ')
```
``` {.kotlin .cb-nb first_number=1}
contamination(" fa adsf adfasdf", 'a')
```

<!-- <https://www.codewars.com/kata/596fba44963025c878000039/train/kotlin> -->


## Aufgabe
Schreibe eine Funktion `removeChar`{.kotlin} die einen String als Argument übergeben bekommt und den String bis auf den ersten und den letzten Buchstaben zurückgibt.

``` {.kotlin .cb-nb first_number=1}
removeChar("Hello")
```
``` {.kotlin .cb-nb first_number=1}
removeChar("Bye")
```

<https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/solutions/kotlin>



## Aufgabe
Schreibe eine Funktion `getCount`. Diese gibt die Anzahl der Vokale in einem String zurück.

``` {.kotlin .cb-nb first_number=1}
getCount("abcde")
```
``` {.kotlin .cb-nb first_number=1}
getCount("adfafweadffasdf")
```

<https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin>



## Aufgabe
Schreibe eine Funktion `makeComplement`. Diese bekommt eine DNA als String übergeben und invertiert diese.  Dabei werden Buchstaben durch einen komplementären Buchstaben ersetzt. A und T sowie C und G sind komplementär.

``` {.kotlin .cb-nb first_number=1}
makeComplement("ATTCG")
```
``` {.kotlin .cb-nb first_number=1}
makeComplement("CGTAG")
```

<https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin>

## Aufgabe
Schreibe eine Funktion `replace`. Diese bekommt einen String als Argument übergeben und gibt einen String zurück indem, alle Vokale durch Ausrufezeichen ersetzt wurden.

``` {.kotlin .cb-nb first_number=1}
replace("Hello")
```
``` {.kotlin .cb-nb first_number=1}
replace("Bye")
```


<https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/solutions/kotlin>




## Aufgabe
Schreibe eine Funktion `nospace`{.kotlin}. Dieser wird ein String
übergeben. Sie gibt den String ohne Leerzeichen zurück.

``` {.kotlin .cb-nb first_number=1}
noSpace("fadsf adfasdf")
```
``` {.kotlin .cb-nb first_number=1}
noSpace(" fa adsf adfasdf")
```

<https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/kotlin>


## Aufgabe
Schreibe eine Funktion `disemvowel`{.kotlin}. Dieser wird ein String
übergeben. Sie gibt den String ohne Vokale zurück.

``` {.kotlin .cb-nb first_number=1}
disemvowel("Day")
```
``` {.kotlin .cb-nb first_number=1}
disemvowel("Apple")
```
``` {.kotlin .cb-nb first_number=1}
disemvowel("Hello world")
```

<https://www.codewars.com/kata/52fba66badcd10859f00097e/train/kotlin>

## Aufgabe
Schreibe eine Funktion `moveVowels`{.kotlin}. Dieser wird ein String
übergeben, der nur Kleinbuchstaben enthält. Sie gibt den String zurück,
indem alle Vokale des Arguments nach hinten verschoben wurden.

``` {.kotlin .cb-nb first_number=1}
moveVowels("day")
```
``` {.kotlin .cb-nb first_number=1}
moveVowels("apple")
```
``` {.kotlin .cb-nb first_number=1}
moveVowels("peace")
```

<!-- <https://www.codewars.com/kata/56bf3287b5106eb10f000899/train/kotlin> -->


## Aufgabe
Schreibe eine Funktion `sumDigits`{.kotlin}. Dieser wird eine Zahl als
Integer übergeben. Sie gibt die Summe der Ziffern in der Zahl zurück.

``` {.kotlin .cb-nb first_number=1}
sumDigits("123")
```
``` {.kotlin .cb-nb first_number=1}
sumDigits("51")
```

<!-- <https://www.codewars.com/kata/52f3149496de55aded000410/train/kotlin> -->

