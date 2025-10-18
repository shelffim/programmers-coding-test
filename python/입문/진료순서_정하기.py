# 진료순서 정하기 문제

def solution(emergency):
    sort_emergency = sorted(emergency, reverse = True)
    answer = [sort_emergency.index(n) + 1 for n in emergency]
    return answer

# sorted()와 sort()의 차이