def grow(arr):
    acc = 1
    for x in arr:
        acc = acc * x
    return acc

def square_sum(numbers):
    acc = 0
    for i in numbers:
        acc = acc + i * i
    return acc

def maps(xs):
    acc = []
    for x in xs:
        acc = acc + [2 * x]
    return acc

def invert(lst):
    acc = []
    for x in lst:
        acc = acc + [-1 * x]
    return acc

def reverse_seq(n):
    acc = []
    for i in range(n):
        acc = acc + [n - i]
    return acc

def positive_sum(arr):
    acc = 0
    for i in arr:
        if i > 0:
            acc = acc + i
    return acc

def find_smallest_int(arr):
    acc = arr[0]
    for x in arr:
        if acc > x:
            acc = x
    return acc

def small_enough(array, limit):
    for x in array:
        if x > limit:
            return False
    return True


def gameToPoints(s:str):
    if s[0] > s[2]:
        return 3
    if s[0] == s[2]:
        return 1
    return 0


def points(games):
    acc = 0
    for game in games:
        acc = acc + gameToPoints(game)
    return acc

def two_oldest_ages(ages):
    oldest_age = 0
    second_oldest_age = 0
    for age in ages:
        if age > oldest_age:
            second_oldest_age = oldest_age
            oldest_age = age
        elif age >= second_oldest_age:
            second_oldest_age = age
    return [second_oldest_age, oldest_age]


def tribonacci(signature, n):
    acc = []
    for i in range(n):
        if i < 3:
            acc = acc + [signature[i]]
        else:
            new_element = acc[i -1] + acc[i - 2] + acc[i - 3]
            acc = acc + [new_element]
    return acc

def find_outlier(integers):
    sum=0
    for number in integers[0:3]:
        if number % 2==0:
            sum=sum+1
    if sum > 1:
        for number in integers:
            if number % 2==1:
                return(number)
    else:
        for number in integers:
            if number % 2==0:
                return(number)


def max_sequence(arr):
    setofsequences = []
    for i in range(len(arr) + 1):
        for j in range(len(arr) + 1 - i):
            setofsequences.append(arr[j:j + i])
    a = 0
    for i in setofsequences[1:]:
        if sum(i) > a:
            a = sum(i)
    return a



def opposite(dir):
    if dir == "NORTH":
        return "SOUTH"
    if dir == "SOUTH":
        return "NORTH"
    if dir == "EAST":
        return "WEST"
    if dir == "WEST":
        return "EAST"

def dir_reduc_helper(arr):
    acc = []
    i = 0
    while i < len(arr) - 1:
        if opposite(arr[i]) == arr[i + 1]:
            i = i + 2
        else:
            acc = acc + [arr[i]]
            i = i + 1
    if i == len(arr) - 1:
        acc = acc + [arr[i]]
    return acc


def dir_reduc(arr):
    acc = arr
    while True:
        new_acc = dir_reduc_helper(acc)
        if new_acc == acc:
            return new_acc
        else:
            acc = new_acc

