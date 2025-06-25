def solution(my_string, letter):
    answer=""
    for s in my_string:
        if letter != s:
            answer+=s
    return answer