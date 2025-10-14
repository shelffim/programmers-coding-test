import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] draft_stu = new int[3];
        for (int i = 0; i < draft_stu.length; i++) {
            int find_rank;
            if (i == 0) {
                find_rank = 1;
            } else {
                find_rank = rank[draft_stu[i - 1]] + 1;
            }
            int j = 0;
            while(true) {
                if (j == rank.length) {
                    find_rank++;
                    j = 0;
                }
                if (attendance[j] && rank[j] == find_rank) {
                    draft_stu[i] = j;
                    break;
                }
                j++;
            }
        }
        return 10000 * draft_stu[0] + 100 * draft_stu[1] + draft_stu[2];
    }
}

/*
 * Stream API를 사용한 대안적 해결 방법:
 * 
 * IntStream.range(0, rank.length)
 *         .filter(i -> attendance[i])
 *         .boxed()
 *         .sorted(Comparator.comparing(i -> rank[i]))
 *         .limit(3L)
 *         .reduce((current, next) -> current * 100 + next)
 *         .get();
 * 
 * 이 코드는 Java 8의 Stream API를 사용한 복합적인 로직입니다. 각 단계별로 자세히 설명하면:
 * 
 * 1. IntStream.range(0, rank.length)
 *    - 역할: 0부터 rank.length-1까지의 정수 스트림을 생성
 *    - 반환값: IntStream (기본형 int 스트림)
 *    - 예시: rank.length가 5라면 → [0, 1, 2, 3, 4] 스트림
 * 
 * 2. .filter(i -> attendance[i])
 *    - 역할: attendance[i]가 true인 인덱스만 필터링
 *    - 매개변수: Predicate<Integer> - 각 인덱스 i에 대해 attendance[i]가 true인지 확인
 *    - 반환값: 조건을 만족하는 인덱스들만 포함된 IntStream
 * 
 * 3. .boxed()
 *    - 역할: IntStream을 Stream<Integer>로 변환
 *    - 이유: 다음 단계인 sorted()에서 Comparator를 사용하기 위해 참조형으로 변환 필요
 *    - 반환값: Stream<Integer>
 * 
 * 4. .sorted(Comparator.comparing(i -> rank[i]))
 *    - 역할: 각 인덱스 i에 대해 rank[i] 값을 기준으로 오름차순 정렬
 *    - 매개변수: Comparator.comparing(i -> rank[i]) - 람다식으로 정렬 기준 정의
 *    - 반환값: rank 값이 작은 순서대로 정렬된 Stream<Integer>
 * 
 * 5. .limit(3L)
 *    - 역할: 스트림에서 처음 3개 요소만 선택
 *    - 매개변수: 3L (long 타입)
 *    - 반환값: 최대 3개 요소를 포함하는 Stream<Integer>
 * 
 * 6. .reduce((current, next) -> current * 100 + next)
 *    - 역할: 스트림의 요소들을 하나의 값으로 축소
 *    - 매개변수: BinaryOperator<Integer> - 두 값을 받아서 하나의 값으로 합치는 함수
 *    - 로직: current * 100 + next - 현재 값에 100을 곱하고 다음 값을 더함
 *    - 반환값: Optional<Integer>
 * 
 * 7. .get()
 *    - 역할: Optional에서 실제 값을 추출
 *    - 주의: Optional이 비어있으면 NoSuchElementException 발생
 *    - 반환값: Integer (최종 결과값)
 * 
 * 예시로 이해하기:
 * // 예시 데이터
 * int[] rank = {3, 1, 4, 1, 5, 2};
 * boolean[] attendance = {true, true, false, true, true, true};
 * 
 * // 단계별 실행 결과:
 * // 1. IntStream.range(0, 6) → [0, 1, 2, 3, 4, 5]
 * // 2. filter(i -> attendance[i]) → [0, 1, 3, 4, 5] (attendance[2]는 false)
 * // 3. boxed() → Stream<Integer> [0, 1, 3, 4, 5]
 * // 4. sorted(Comparator.comparing(i -> rank[i])) → [1, 3, 0, 5, 4] (rank 값: 1,1,3,2,5)
 * // 5. limit(3L) → [1, 3, 0] (상위 3개)
 * // 6. reduce(...) → 1 * 100 + 3 = 103, 103 * 100 + 0 = 10300
 * // 7. get() → 10300
 * 
 * 핵심 포인트:
 * 1. Stream API의 체이닝: 여러 연산을 연결하여 복잡한 로직을 간결하게 표현
 * 2. 함수형 프로그래밍: 람다식과 메서드 참조를 활용
 * 3. 지연 평가: 스트림은 터미널 연산(reduce, get)이 호출될 때까지 실제로 실행되지 않음
 * 4. Optional 사용: reduce는 빈 스트림에 대해 Optional.empty()를 반환할 수 있음
 * 
 * 이 로직은 출석한 학생들 중에서 성적이 가장 좋은 상위 3명의 인덱스를 하나의 숫자로 인코딩하는 용도입니다.
 * 
 * 
 * PriorityQueue를 사용한 대안적 해결 방법:
 * 
 * PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
 * for (int i = 0; i < attendance.length; i++) {
 *     if (attendance[i])
 *         que.add(i);
 * }
 * return que.poll() * 10000 + que.poll() * 100 + que.poll();
 * 
 * 이 코드는 PriorityQueue를 사용한 우선순위 큐 기반의 해결 방법입니다. 각 부분을 자세히 설명하면:
 * 
 * 1. PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
 *    - 역할: 우선순위 큐를 생성하고 정렬 기준을 정의
 *    - 매개변수: Comparator<Integer> - 람다식 (a, b) -> rank[a] - rank[b]
 *    - 정렬 기준: 
 *      * rank[a] - rank[b]가 음수면 a가 b보다 우선순위가 높음 (rank 값이 작음)
 *      * rank[a] - rank[b]가 양수면 b가 a보다 우선순위가 높음
 *      * 결과적으로 rank 값이 작은 순서대로 정렬됨 (오름차순)
 *    - 반환값: PriorityQueue<Integer> - rank 값 기준으로 정렬된 우선순위 큐
 * 
 * 2. for (int i = 0; i < attendance.length; i++)
 *    - 역할: attendance 배열의 모든 인덱스를 순회
 *    - 반복 범위: 0부터 attendance.length-1까지
 * 
 * 3. if (attendance[i])
 *    - 역할: 현재 인덱스 i의 attendance 값이 true인지 확인
 *    - 조건: 출석한 학생만 처리하기 위한 필터링
 * 
 * 4. que.add(i);
 *    - 역할: 조건을 만족하는 인덱스 i를 우선순위 큐에 추가
 *    - 동작: 큐에 추가될 때 자동으로 rank[i] 값에 따라 정렬됨
 *    - 시간복잡도: O(log n) - 힙 구조로 인해
 * 
 * 5. return que.poll() * 10000 + que.poll() * 100 + que.poll();
 *    - 역할: 우선순위 큐에서 rank 값이 가장 작은 3개를 순서대로 꺼내서 하나의 숫자로 합침
 *    - que.poll(): 
 *      * 큐의 최상위 요소(가장 작은 rank 값을 가진 인덱스)를 제거하고 반환
 *      * 큐가 비어있으면 null 반환
 *      * 시간복잡도: O(log n)
 *    - 계산 방식:
 *      * 첫 번째 poll(): rank가 가장 작은 인덱스 × 10000
 *      * 두 번째 poll(): rank가 두 번째로 작은 인덱스 × 100
 *      * 세 번째 poll(): rank가 세 번째로 작은 인덱스 × 1
 * 
 * 예시로 이해하기:
 * // 예시 데이터
 * int[] rank = {3, 1, 4, 1, 5, 2};
 * boolean[] attendance = {true, true, false, true, true, true};
 * 
 * // 단계별 실행 결과:
 * // 1. PriorityQueue 생성: (a, b) -> rank[a] - rank[b] 기준
 * // 2. for 루프 실행:
 * //    - i=0: attendance[0]=true → que.add(0) → 큐: [0] (rank[0]=3)
 * //    - i=1: attendance[1]=true → que.add(1) → 큐: [1, 0] (rank[1]=1, rank[0]=3)
 * //    - i=2: attendance[2]=false → 건너뜀
 * //    - i=3: attendance[3]=true → que.add(3) → 큐: [1, 3, 0] (rank[1]=1, rank[3]=1, rank[0]=3)
 * //    - i=4: attendance[4]=true → que.add(4) → 큐: [1, 3, 0, 4] (rank[4]=5)
 * //    - i=5: attendance[5]=true → que.add(5) → 큐: [1, 3, 5, 0, 4] (rank[5]=2)
 * // 3. 최종 큐 상태: [1, 3, 5, 0, 4] (rank 값: 1, 1, 2, 3, 5)
 * // 4. poll() 실행:
 * //    - que.poll() → 1 (rank=1) → 1 * 10000 = 10000
 * //    - que.poll() → 3 (rank=1) → 3 * 100 = 300
 * //    - que.poll() → 5 (rank=2) → 5 * 1 = 5
 * // 5. 최종 결과: 10000 + 300 + 5 = 10305
 * 
 * 핵심 포인트:
 * 1. 우선순위 큐의 장점:
 *    - 자동 정렬: 요소가 추가될 때마다 자동으로 정렬됨
 *    - 효율적인 최솟값 추출: poll()로 항상 최솟값을 O(log n) 시간에 추출
 * 
 * 2. Comparator 람다식:
 *    - (a, b) -> rank[a] - rank[b]: 인덱스 a, b의 rank 값을 비교
 *    - 음수 반환 시 a가 우선순위 높음 (rank 값이 작음)
 *    - 양수 반환 시 b가 우선순위 높음
 * 
 * 3. 시간복잡도:
 *    - 전체 시간복잡도: O(n log n)
 *    - add(): O(log n) × n번 = O(n log n)
 *    - poll(): O(log n) × 3번 = O(3 log n)
 * 
 * 4. 공간복잡도:
 *    - O(n): 최악의 경우 모든 요소가 큐에 저장됨
 * 
 * 다른 방법과의 비교:
 * 1. Stream API 방식: 함수형 프로그래밍 스타일, 간결하지만 중간 컬렉션 생성
 * 2. PriorityQueue 방식: 명령형 프로그래밍 스타일, 메모리 효율적
 * 3. 기존 for 루프 방식: 가장 직관적이지만 코드가 길고 복잡
 * 
 * PriorityQueue 방식은 메모리 효율적이면서도 코드가 비교적 간결한 장점이 있습니다.
 */