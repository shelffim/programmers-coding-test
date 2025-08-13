# 숫자 찾기 문제

def solution(num, k):
    answer = int(f"{num}".find(f"{k}"))
    if answer != -1:
        answer += 1
    return answer