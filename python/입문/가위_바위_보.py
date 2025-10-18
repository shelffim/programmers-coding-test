def solution(rsp):
    answer = "".join(map(lambda p: "0" if p=="2" else "5" if p=="0" else "2" if p=="5" else "",rsp))
    return answer

# replace, rsp.translate(str.maketrans('025', '502'))
