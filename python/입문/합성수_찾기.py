# 합성수 찾기 문제

def solution(n):
    answer = len([n1 for n1 in range(1,n+1) if len([n2 for n2 in range(1,n1+1) if n1 % n2 == 0]) >= 3])
    return answer

# all()