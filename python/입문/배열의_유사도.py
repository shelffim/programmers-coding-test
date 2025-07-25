def solution(s1, s2):
    answer = len(list(filter(lambda s: s in s2,s1)))
    return answer

# in 과 find 차이
# &, |, -, ^ 연산자