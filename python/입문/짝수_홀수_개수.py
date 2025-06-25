def solution(num_list):
    answer = []
    e_c=0
    o_c=0
    for i in num_list:
        if i % 2 == 0:
            e_c+=1
        else:
            o_c+=1
    answer.append(e_c)
    answer.append(o_c)
    return answer