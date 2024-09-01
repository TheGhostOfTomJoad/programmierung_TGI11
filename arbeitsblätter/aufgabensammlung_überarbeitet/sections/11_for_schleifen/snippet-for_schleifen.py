def print_squares_0_10():
    for i in range(11):
        print(i * i)
        # print(str(i) + " * " + str(i)  + " = " + str(i * i))


def print_squares(n):
    for i in range(n):
        print(i * i)
        # print(str(i) + " * " + str(i)  + " = " + str(i * i))


def print_squares_nicer(n):
    print("The first " + str(n) + " squares are:")
    for i in range(n):
        print(i * i)
        # print(str(i) + " * " + str(i)  + " = " + str(i * i))
    print("Goodbye")


def print_squares_start_end(lower, upper):
    print("The square of the numbers from " + str(lower) + " up to " + str(upper) + " are:")
    for i in range(lower, upper + 1):
        print(i * i)
        # print(str(i) + " * " + str(i)  + " = " + str(i * i))
    print("Goodbye")

def print_squares_start_end_pretty(lower, upper):
    print("The square of the numbers from " + str(lower) + " up to " + str(upper) + " are:")
    for i in range(lower, upper + 1):
        # print(i * i)
        print(str(i) + " * " + str(i)  + " = " + str(i * i))
    print("Goodbye")



def summation(n):
    acc = 0
    for i in range(n + 1):
        acc = acc + i
    return acc

def factorial(n):
    acc = 1
    for i in range(1, n + 1):
        acc = acc * i
    return acc

def number_to_pwr(number, p):
    acc = 1
    for i in range(p):
        acc = acc * number
    return acc


def count_sheep(n):
    acc = ""
    for i in range(1, n + 1):
        acc = acc + str(i) + " sheep..."
    return acc

def sum_cubes(n):
    acc = 0
    for i in range(n + 1):
        acc = acc + i * i * i
    return acc

def get_sum(a,b):
    acc = 0
    if a > b:
        left = b
        right = a
    else:
        left = a
        right = b
    for i in range(left, right + 1):
        acc = acc + i
    return acc

def choose(n,k):
    if k > n:
        return 0
    return factorial(n)//(factorial (n-k) * factorial (k))



def solution(number):
    acc = 0
    for i in range(number):
        if i % 3 == 0 or i % 5 == 0:
            acc  += i
    return acc


def divisors(n):
    acc = 0
    for i in range(1, n + 1):
        if n % i == 0:
            acc = acc + 1
    return acc

def is_prime(n):
    return divisors(n) == 2


def sum_divisors(n):
    acc = 0
    for i in range(1,n):
        if n % i == 0:
            acc = acc + i
    return acc

def is_perfect(n):
    return sum_divisors(n) == n

def amicable_numbers(n1,n2):
    return n1 != n2 and sum_divisors(n1) == n2 and  sum_divisors(n2) == n1


def abundant_number(n):
    return sum_divisors(n) > n

def nth_fib(n):
    a, b = 0, 1
    for i in range(1, n):
        a, b = b , a + b
    return a
