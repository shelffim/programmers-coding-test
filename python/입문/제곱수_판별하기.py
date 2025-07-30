def solution(n):
    answer = 2 - ((n ** 0.5) % 1 == 0)
    return answer

# is_integer