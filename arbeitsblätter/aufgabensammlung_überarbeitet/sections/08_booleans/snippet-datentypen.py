

def set_alarm(employed: bool, vacation: bool) -> bool:
    return employed and not vacation

def xor(a: bool, b: bool) -> bool:
    return (a and not b) or (not a and b)

def hero(bullets, dragons) -> bool:
   return bullets  >= 2 * dragons

def is_triangle(a, b, c):
    return a < b + c and b < a + c and c < a + b

def zero_fuel(distance_to_pump, mpg, fuel_left):
    return mpg * fuel_left >= distance_to_pump


def check_for_factor(base, factor):
    return base % factor == 0
