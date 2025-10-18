# 중복된 문자 제거 문제

def solution(my_string):
    answer = ''
    for s in my_string:
        if not s in answer:
            answer += s
    return answer

# dict.fromkeys(my_string)
# python 3.7 이상에서 딕셔너리가 삽입 순서를 기억
# 딕셔너리 특징
# 딕셔너리를 join() 하면 딕셔너리 키들만 연결