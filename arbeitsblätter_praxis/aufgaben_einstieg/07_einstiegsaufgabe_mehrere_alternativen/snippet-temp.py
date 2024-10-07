def to_much_alcohol(amount: int) -> str:
    if amount < 10:
        return "low risk"
    else:
        return "unhealty"
        
def to_much_alcohol_better(amount: int) -> str:
    if amount < 10:
                return "low risk"
    elif amount <= 20:
                return "unhealty"
    else:
                return "very unhealty"
