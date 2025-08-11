# 대문자와 소문자 문제

def solution(my_string):
    answer = "".join([s.upper() if s.islower() else s.lower() for s in my_string])
    return answer

# translate(), maketrans(), swapcase()