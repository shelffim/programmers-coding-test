# 문자열 정렬하기 2 문제

def solution(my_string):
    answer = "".join(sorted([s.lower() for s in my_string]))
    return answer

# sorted() vs sort(), lower(), ord()