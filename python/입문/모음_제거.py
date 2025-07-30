# 다시해보기
# def solution(my_string):
#     answer = "".join([s for s in my_string if not (s in "aeiou")])
#     return answer

def solution(my_string):
    answer = "".join(list(filter(lambda s: s not in ["a","e","i","o","u"],my_string)))
    return answer