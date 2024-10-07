
# def print_to_small_or_to_big(guessed_number, number_to_guess):
#     if guessed_number < number_to_guess:
#         print("Diese Zahl ist zu klein!")
#     else:
#         print("Diese Zahl ist zu groß!")
# 
# def guess_till_guessed(number_to_guess:int):
#     guessed_number = int(input("Gib eine Zahl ein: "))
#     while guessed_number != number_to_guess:
#         print_to_small_or_to_big(guessed_number, number_to_guess)
#         guessed_number = int(input("Gib eine Zahl ein: "))
#     print("Richtig")
        
        

def equal_to_small_or_to_big(guessed_number, number_to_guess):
    if guessed_number == number_to_guess:
        print("Richtig")
        return True
    elif guessed_number < number_to_guess:
        print("Diese Zahl ist zu klein!")
    else:
        print("Diese Zahl ist zu groß!")
    return False
        

def guessing_game():
    number_to_guess = int(input("Gib ein welche Zahl erraten werden soll: "))
    guessed_right = False
    while not guessed_right:
        guessed_number = int(input("Gib eine Zahl ein: "))
        guessed_right = equal_to_small_or_to_big(guessed_number, number_to_guess)
        
    
    