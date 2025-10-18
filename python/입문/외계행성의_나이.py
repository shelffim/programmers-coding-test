# 외계행성의 나이 문제

def solution(age):
    answer = "".join([chr(int(c)+97) for c in str(age)])
    return answer

# chr(), ord(), replace()