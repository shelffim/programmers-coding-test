class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}

//Math.max()

/*
 * Stream API를 사용한 배열 내림차순 정렬 코드 분석:
 * numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
 * 
 * 1. Arrays.stream(numbers): int[] → IntStream 변환
 * 2. .boxed(): IntStream → Stream<Integer> 변환 (원시타입을 래퍼클래스로 박싱)
 *    - IntStream에는 sorted(Comparator) 메서드가 없어서 boxed() 필요
 * 3. .sorted(Comparator.reverseOrder()): 내림차순 정렬
 * 4. .mapToInt(Integer::intValue): Stream<Integer> → IntStream 변환 (언박싱)
 * 5. .toArray(): IntStream → int[] 변환
 * 
 * 전체 흐름: int[] → IntStream → Stream<Integer> → 정렬된 Stream<Integer> → IntStream → int[]
 * 
 */