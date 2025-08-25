# 가까운 수 문제

def solution(array, n):
    array.sort()
    answer = array[0]
    diff = abs(answer - n)
    for i in array:
        d = abs(i - n)
        if diff > d:
            diff = d
            answer = i
    return answer