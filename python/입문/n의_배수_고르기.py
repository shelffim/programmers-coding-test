def solution(n, numlist):
    answer = [num for num in numlist if num % n ==0]
    return answer

# filter와 컴프리헨션 차이