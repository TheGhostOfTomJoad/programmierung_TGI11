


def even_or_odd(number):
    if number % 2 == 0:
        return "Even"
    else:
        return "Odd"

def simple_multiplication(number) :
    if number % 2 == 0:
        return 8 * number
    else:
        return 9 * number

def multiple(x):
    if x % 3 == 0 and x % 5 == 0:
        return "BangBoom"
    elif x % 3 == 0:
        return "Bang"
    elif x % 5 == 0:
        return "Boom"
    else:
        return "Miss"




def bool_to_word(boolean:bool):
    if boolean:
        return "Yes"
    else:
        return "No"

def bonus_time(salary, bonus):
    if bonus:
        return "$" + str(10 * salary)
    else:
        return "$" + str(salary)

def hoop_count(n):
    if n < 10:
        return "Keep at it until you get it"
    else:
        return "Great, now move on to tricks"


def rps(p1, p2):
    if p1 == p2:
        return "Draw!"
    if p1 == "rock" and p2 == "scissors" or p1 == "paper" and p2 == "rock" or p1 == "scissors" and p2 == "paper":
        return "Player 1 won!"
    else:
        return "Player 2 won!"


def paperwork(n, m):
    if n < 0 or m < 0:
        return 0
    else:
        return n * m


def avg(s1, s2, s3):
    return (s1 + s2 +s3)//3

def get_grade(s1, s2, s3):
    if avg(s1, s2, s3) >= 90:
        return "A"
    elif avg(s1, s2, s3) >= 80:
        return "B"
    elif avg(s1, s2, s3) >= 70:
        return "C"
    elif avg(s1, s2, s3) >= 60:
        return "D"
    else:
        return "F"



def basic_op(operator, value1, value2):
    if operator == '+':
        return value1 + value2
    elif operator == '-':
        return value1 - value2
    elif operator == '*':
        return value1 * value2
    else:
        return value1 / value2

