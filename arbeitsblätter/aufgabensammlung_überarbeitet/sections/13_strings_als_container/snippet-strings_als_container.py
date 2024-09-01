def no_space(s):
    acc = ""
    for char in s:
        if char != " ":
            acc = acc + char
    return acc

def contamination(text, new_char):
    acc = ""
    for char in text:
        acc = acc + new_char
    return acc

def double_char(s):
    acc = ""
    for char in s:
        acc = acc + 2 * char
    return acc

def is_vowel(char):
    return char == "a" or char == "e" or char == "i" or char == "o" or char == "u" or char == "A" or char == "E" or char == "I" or char == "O" or char == "U"


def disemvowel(s):
    acc = ""
    for char in s:
        if not is_vowel(char):
            acc = acc + char
    return acc

def move_vowels(input):
    not_vowels = ""
    vowels =""
    for char in input:
        if char == "a" or char == "e" or char == "i" or char == "o" or char == "u":
            vowels = vowels + char
        else:
            not_vowels = not_vowels + char
    return not_vowels + vowels

def sum_digits(number):
    acc = 0
    for digit in str(number):
        if digit != "-":
            acc = acc + int(digit)
    return acc

