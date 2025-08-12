# 약수 구하기 문제

def solution(n):
    answer = [i for i in range(1,n+1) if n % i == 0]
    return answer