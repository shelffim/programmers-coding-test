# 피자 나눠 먹기 2 문제

def solution(n):
    answer = 1
    while answer * 6 % n != 0:
        answer += 1
    return answer