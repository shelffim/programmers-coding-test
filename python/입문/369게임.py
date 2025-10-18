# 369게임 문제

def solution(order):
    answer = len([clap for clap in str(order) if clap in "369"])
    return answer

# count() 사용