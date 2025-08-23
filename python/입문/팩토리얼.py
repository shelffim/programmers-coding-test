# 팩토리얼 문제

import math

def solution(n):
    answer = max([number for number in range(1, 11) if math.prod([num for num in range(1, number+1)]) <= n])
    return answer

# math.factorial()