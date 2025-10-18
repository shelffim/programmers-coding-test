# k의 개수 문제

def solution(i, j, k):
    answer = sum([sum([1 for n in str(num) if n==str(k)]) for num in range(i,j+1)])
    return answer

# sum()