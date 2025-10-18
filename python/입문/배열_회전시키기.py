# 배열 회전시키기 문제

def solution(numbers, direction):
    return numbers[1:] + [numbers[0]] if direction == "left" else [numbers[-1]] + numbers[:-1]