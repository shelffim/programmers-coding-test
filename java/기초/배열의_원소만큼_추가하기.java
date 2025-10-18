import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);   
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

/*
 * 다른 사람의 Stream API 풀이:
 * Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
 *
 * 각 메서드 설명:
 *
 * 1. Arrays.stream(arr)
 *    - 배열(int[])을 IntStream으로 변환
 *    - 예: [2, 3, 1] → IntStream{2, 3, 1}
 *
 * 2. .boxed()
 *    - 기본형 타입(int)을 래퍼 클래스(Integer)로 박싱
 *    - IntStream을 Stream<Integer>로 변환
 *    - 이후 flatMap 등의 제네릭 메서드를 사용하기 위해 필요
 *    - 예: IntStream{2, 3, 1} → Stream<Integer>{2, 3, 1}
 *
 * 3. .flatMap(num -> Collections.nCopies(num, num).stream())
 *    - flatMap: 각 요소를 스트림으로 매핑한 후, 모든 스트림을 하나로 평탄화(flatten)
 *    - Collections.nCopies(num, num):
 *      * 첫 번째 num: 복사할 횟수
 *      * 두 번째 num: 복사할 값
 *      * num 값을 num번 반복하는 불변 리스트를 생성
 *      * 예: nCopies(3, 3) → [3, 3, 3]
 *    - .stream(): 생성된 리스트를 스트림으로 변환
 *
 *    작동 과정:
 *    num=2 → nCopies(2, 2) → [2, 2] → Stream{2, 2}
 *    num=3 → nCopies(3, 3) → [3, 3, 3] → Stream{3, 3, 3}
 *    num=1 → nCopies(1, 1) → [1] → Stream{1}
 *    
 *    flatMap이 이 모든 스트림을 하나로 합침:
 *    Stream{2, 2} + Stream{3, 3, 3} + Stream{1} → Stream{2, 2, 3, 3, 3, 1}
 *
 * 4. .collect(Collectors.toList())
 *    - 스트림의 모든 요소를 List<Integer>로 수집
 *    - 최종 결과: [2, 2, 3, 3, 3, 1]
 *
 * 전체 예시 (입력: arr = [2, 3, 1]):
 * Arrays.stream(arr)                    → IntStream{2, 3, 1}
 * .boxed()                              → Stream<Integer>{2, 3, 1}
 * .flatMap(num -> ...)
 *   num=2 → [2,2].stream()             → Stream{2, 2}
 *   num=3 → [3,3,3].stream()           → Stream{3, 3, 3}
 *   num=1 → [1].stream()               → Stream{1}
 *   (평탄화)                            → Stream{2, 2, 3, 3, 3, 1}
 * .collect(Collectors.toList())        → List[2, 2, 3, 3, 3, 1]
 *
 * 장점:
 * - 코드가 매우 간결함 (한 줄로 표현)
 * - 함수형 프로그래밍 스타일
 * - 가독성이 좋음 (익숙해지면)
 *
 * 단점:
 * - Stream API에 익숙하지 않으면 이해하기 어려움
 * - List<Integer>를 반환하므로 문제가 int[]를 요구하면 추가 변환 필요
 * - 성능상 약간의 오버헤드 (작은 데이터에서는 무시할 수준)
 */