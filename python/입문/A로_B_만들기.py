# A로 B 만들기 문제

def solution(before, after):
    answer = 1 if sorted(before) == sorted(after) else 0
    return answer

# sorted()