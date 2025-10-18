def solution(numbers):
    numbers.sort()
    answer = max(numbers[0] * numbers[1], numbers[len(numbers) - 1] * numbers[len(numbers) - 2])
    return answer

# len 안 쓰고 -1, -2 넣어도 됨.