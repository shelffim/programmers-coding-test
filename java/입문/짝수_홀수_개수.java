class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for (int num : num_list) {
            answer[num % 2]++;
        }
        return answer;
    }
}

/*
 * 다른 사람의 코드 분석:
 * 
 * IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), 
 *              (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
 * 
 * 질문: IntStream.of()이 무슨 기능인지?
 * 
 * 답변: IntStream.of()는 여러 개의 int 값을 받아서 IntStream을 생성하는 정적 메서드입니다.
 * 
 * - 가변 인자(varargs)로 여러 int 값을 받을 수 있음
 * - 받은 값들로 구성된 IntStream을 반환
 * - 위 코드에서는 [짝수개수, 홀수개수] 두 값을 받아서 IntStream 생성 후 toArray()로 배열 변환
 * 
 * 예시: IntStream.of(1, 2, 3).toArray() → [1, 2, 3]
 * 
 * Q1: IntStream이 뭐야?
 * A1: IntStream은 Java 8 Stream API의 일부로, int 타입의 원시 데이터를 처리하기 위한 스트림입니다.
 *     - 함수형 프로그래밍을 지원하는 데이터 처리 파이프라인
 *     - 지연 평가(Lazy Evaluation)로 메모리 효율적
 *     - 메서드 체이닝으로 가독성 향상
 *     - 주요 메서드: filter(), map(), count(), sum(), toArray() 등
 * 
 * Q2: IntStream이랑 배열이랑 무슨 차이야?
 * A2: 
 *     배열 (Array):
 *     - 데이터 저장소: 실제 데이터를 메모리에 저장
 *     - 인덱스로 직접 접근 가능 (array[0])
 *     - 여러 번 재사용 가능
 *     - 즉시 실행, 고정 크기
 *     - 명령형 프로그래밍 스타일
 * 
 *     IntStream:
 *     - 데이터 처리 파이프라인: 처리 방법을 정의
 *     - 순차적 접근만 가능
 *     - 일회용 (최종 연산 후 소모됨)
 *     - 지연 실행, 동적 처리
 *     - 함수형 프로그래밍 스타일
 * 
 *     요약: 배열은 "데이터를 담는 그릇", IntStream은 "데이터를 처리하는 도구"
 */