def solution(box, n):
    answer = (box[0] // n) * (box[1] // n) * (box[2] // n)
    return answer

# math.prod(map(lambda v: v//n, box))