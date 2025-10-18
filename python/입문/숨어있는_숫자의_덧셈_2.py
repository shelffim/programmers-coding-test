# 숨어있는 숫자의 덧셈 2 문제

import re

def solution(my_string):
    answer = sum([int(s) for s in re.split(r'[^0-9]+',my_string) if s])
    return answer

# 정규표현식, r 프랙티스, re 모듈, [0-9]+와 [0-9]의 차이, r'[0-9]+'와 r'\d+'의 장단점