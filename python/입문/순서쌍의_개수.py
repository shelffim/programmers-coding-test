def solution(n):
    arr = [i for i in range(1,n+1) ]
    answer = len(list(filter(lambda a: n % a == 0, arr)))
    return answer

# range(n)