def greet(name: str) -> str:
    return "Hello, " + name + " how are you doing today?"

def square(n: int) -> int:
    return n * n

def otherangle(alpha: int, beta:int) -> int:
    return 180 - alpha - beta

def greet_io():
    name = input("What is your name? ")
    print(greet(name))

def square_io():
    n = int(input("Please input an integer! "))
    print("The square of " + str(n) + " is " + str(n * n))


def otherangle_io():
    alpha = int(input("Please input the size of alpha in degrees! "))
    beta = int(input("Please input the size of beta in degrees! "))
    gamma = otherangle(alpha, beta)
    print("Gamma has " + str(gamma) + " degrees!")

