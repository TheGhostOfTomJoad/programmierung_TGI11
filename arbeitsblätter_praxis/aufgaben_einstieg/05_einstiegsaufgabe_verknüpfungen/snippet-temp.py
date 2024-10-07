def to_gas_station(km_to_gas_station, km_per_l, liter, flat_tire):
        return km_to_gas_station <= km_per_l * liter and not flat_tire
