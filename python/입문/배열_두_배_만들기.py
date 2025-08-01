def solution(numbers):
    answer = [n*2 for n in numbers]
    return answer

# map > list comprehension > map + lambda > for loop 순으로 빠르다