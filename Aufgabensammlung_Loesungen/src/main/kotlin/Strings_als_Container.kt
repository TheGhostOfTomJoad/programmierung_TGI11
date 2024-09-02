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