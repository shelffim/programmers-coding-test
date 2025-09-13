class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        int max = array[idx];
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                idx = i;
            }
        }
        int[] answer = {max, idx};
        return answer;
    }
}

/*
=== Stream API를 사용한 대안적 해결 방법 ===

다른 사람이 푼 코드 (Stream API 사용):
IntStream.range(0, array.length)
    .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, array[i]))
    .max(Map.Entry.comparingByValue())
    .map(entry -> new int[]{entry.getValue(), entry.getKey()})
    .orElseThrow();

=== 작동 방식 ===
1. IntStream.range(0, array.length)
   - 0부터 array.length-1까지의 정수 스트림 생성
   - 예: 배열 길이가 5라면 [0, 1, 2, 3, 4] 스트림 생성

2. .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, array[i]))
   - 각 인덱스 i를 (인덱스, 값) 쌍으로 변환
   - mapToObj: IntStream을 일반 객체 스트림으로 변환
   - AbstractMap.SimpleEntry: Map.Entry 인터페이스의 간단한 구현체
   - 예: [0, 1, 2] → [(0, array[0]), (1, array[1]), (2, array[2])]

3. .max(Map.Entry.comparingByValue())
   - 값(value)을 기준으로 최댓값을 가진 Entry를 찾기
   - Map.Entry.comparingByValue(): 값으로 비교하는 Comparator 생성
   - 반환 타입: Optional<Map.Entry<Integer, Integer>>

4. .map(entry -> new int[]{entry.getValue(), entry.getKey()})
   - Entry를 [값, 인덱스] 형태의 배열로 변환
   - entry.getValue(): Entry의 값 (원래 배열의 요소)
   - entry.getKey(): Entry의 키 (원래 배열의 인덱스)

5. .orElseThrow()
   - Optional이 비어있으면 예외를 던지고, 값이 있으면 그 값을 반환
   - 예외: NoSuchElementException (빈 스트림인 경우)

=== 실행 예시 ===
int[] array = {3, 7, 2, 9, 1};
// 1. IntStream.range(0, 5) → [0, 1, 2, 3, 4]
// 2. mapToObj → [(0,3), (1,7), (2,2), (3,9), (4,1)]
// 3. max(comparingByValue()) → (3,9)  // 값 9가 최댓값
// 4. map → [9, 3]  // [값, 인덱스]
// 5. orElseThrow() → [9, 3]
// 결과: [9, 3] (최댓값 9, 인덱스 3)

=== AbstractMap.SimpleEntry 상세 설명 ===
- 정의: Map.Entry 인터페이스의 간단한 구현체 (Java 표준 라이브러리 제공)
- 목적: 키-값 쌍을 저장하고 조작할 수 있는 객체
- 특징:
  * 불변 키: 키는 한 번 설정되면 변경 불가
  * 가변 값: 값은 setValue()로 변경 가능
  * 경량: 최소한의 메모리 사용
  * Thread-safe 아님: 동시성 보장 안됨

주요 메서드:
- getKey(): 키 반환
- getValue(): 값 반환
- setValue(V value): 값 설정 (새 값 반환)
- equals(Object o): 동등성 비교
- hashCode(): 해시코드

=== Map.Entry.comparingByValue() 상세 설명 ===
- 정의: Map.Entry의 값(value)을 기준으로 비교하는 Comparator를 생성하는 정적 메서드
- 목적: Map.Entry 객체들을 값 기준으로 정렬하거나 최댓값/최솟값을 찾을 때 사용

메서드 시그니처:
- comparingByValue(): 자연 순서로 비교 (Comparable 구현 필요)
- comparingByValue(Comparator<? super V> cmp): 커스텀 비교자 사용

작동 원리:
- (e1, e2) -> e1.getValue().compareTo(e2.getValue()) 형태로 동작
- 값들을 비교하여 정렬 순서 결정

사용 예시:
- entries.sort(Map.Entry.comparingByValue()); // 오름차순 정렬
- entries.sort(Map.Entry.comparingByValue(Collections.reverseOrder())); // 내림차순 정렬
- stream.max(Map.Entry.comparingByValue()); // 최댓값 찾기

=== 인터페이스 구현체 개념 ===
- 인터페이스: "무엇을 해야 하는지" 정의 (계약)
- 구현체: "어떻게 할 것인지" 구체적으로 구현 (실제 코드)
- AbstractMap.SimpleEntry: Map.Entry 인터페이스의 간단한 구현체
- 장점: 다형성, 교체 가능성, 확장성, 코드 재사용성

=== Stream API 방식의 장점 ===
1. 함수형 프로그래밍: 명령형이 아닌 선언적 방식
2. 간결함: 한 줄로 복잡한 로직 표현
3. 안전성: Optional을 사용하여 null 안전성 확보
4. 가독성: 각 단계가 명확하게 분리됨
5. 현대적: Java 8+ 스타일의 코드
*/