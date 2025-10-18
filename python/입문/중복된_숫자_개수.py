def solution(array, n):
    answer = len(list(filter(lambda a: a == n,array)))
    return answer

# count