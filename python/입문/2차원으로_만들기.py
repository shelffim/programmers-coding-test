# 2차원으로 만들기 문제

def solution(num_list, n):
    answer = [[num_list[i] for i in range(idx,idx+n)] for idx in range(0,len(num_list),n)]
    return answer