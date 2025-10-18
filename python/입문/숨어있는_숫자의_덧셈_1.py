def solution(my_string):
    answer = [int(s) for s in my_string if s in "123456789"]
    return sum(answer)

# contains , in 차이, isdigit()