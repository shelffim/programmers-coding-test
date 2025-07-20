# 다시해보기
def solution(my_string):
    answer = "".join([s for s in my_string if not (s in "aeiou")])
    return answer
