def power_of_two(x):
    i = 1
    while i < x:
        i = i * 2
    return i == x


def halving_sum(n):
    acc = 0
    while n >= 1:
        acc = acc + n
        n = n//2
    return acc




def nb_year(p0, percent, aug, p):
    percent =  1 + percent/100
    years = 0
    while p0 < p:
        p0 = int(p0* percent) + aug
        years = years + 1
    return years


def is_square(n):
    i = 0
    while i * i < n:
        i = i + 1
    return i * i == n

def next_collatz(n):
    if n % 2 == 0:
        return n // 2
    else:
        return 3 * n + 1


def hotpo(n):
    counter = 0
    while n != 1:
        n = next_collatz(n)
        counter = counter + 1
    return counter



def collatz(n):
    acc = str(n)
    while n != 1:
        n = next_collatz(n)
        acc = acc + "->" + str(n)
    return acc


