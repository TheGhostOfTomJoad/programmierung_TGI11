def enough_cars(persons, cars):
        return 5 * cars >= persons
        
def enough_cars_verbose(persons, cars):
    if 5 * cars >= persons:
        return "Die Autos reichen aus"
    else:
        return "Die Autos reichen nicht aus"
