# 한 번만 등장한 문자 문제

def solution(s):
    answer = {}
    for str in s:
        if str in answer:
            answer[str] += 1
        else:
            answer[str] = 1
    return "".join(sorted([key for key, value in answer.items() if value == 1]))

# 딕셔너리에 키가 있는지 확인하는 방법