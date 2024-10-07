def hoop_count_helper(count: int) -> bool:
    return count >= 10

def paperwork_helper(n, m):
        return n > 0 and m > 0

def player_1_wins(player_1: str, player_2: str) -> bool:
        return player_1 == "rock" and player_2 == "scissors" or player_1 == "paper" and player_2 == "rock" or player_1 == "scissors" and player_2 == "paper"
