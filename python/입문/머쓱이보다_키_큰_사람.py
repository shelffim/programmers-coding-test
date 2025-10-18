def solution(array, height):
    answer = list(filter(lambda x: x > height, array))
    return len(answer)

# len vs count 학습하기
# 제네레이터 컴프리헨션 학습하기
# def solution(array, height):
#     return sum(1 for a in array if a > height)