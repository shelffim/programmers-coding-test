class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for(int n: num_list) {
            sum += n;
            mul *= n;
        }
        return mul < Math.pow(sum,2) ? 1 : 0;
    }
}

/*
 * Q: Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() 에서 getAsInt()는 무슨 기능?
 * A: getAsInt()는 OptionalInt에서 실제 int 값을 추출하는 메서드
 *    - reduce()는 OptionalInt를 반환 (빈 배열일 때 결과가 없을 수 있음)
 *    - getAsInt()는 값이 있으면 반환, 없으면 NoSuchElementException 발생
 *    - 더 안전한 방법: orElse(기본값) 사용
 */