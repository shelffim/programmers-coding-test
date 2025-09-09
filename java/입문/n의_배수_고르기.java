class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;
        // n의 배수인 원소의 개수
        for(int num: numlist) {
            if (num % n == 0) {
                count++;
            }
        }
        //n의 배수인 원소의 개수 크기의 배열 선언
        answer = new int[count];
        
        //n의 배수인 원소들만 복사
        for(int i = 0, index = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[index++] = numlist[i];
            }
        }
        return answer;
    }
}

/*
=== 고급 자바 문법 분석 및 비교 ===

Q1: List<Integer> answerList = new ArrayList<Integer>(); 코드 분석
A1: List와 ArrayList 사용법
- 왜 사용: 배열 크기를 미리 알 수 없을 때 동적 크기 조정 가능
- 어떻게 사용: List<Integer> answerList = new ArrayList<Integer>();
- 장점: 크기를 미리 계산할 필요 없음, add()로 간편하게 추가
- 단점: 메모리 오버헤드, Integer 객체 생성으로 인한 GC 압박

Q2: mapToInt와 향상된 for문에서 Integer vs int 차이점
A2: Auto-boxing과 타입 선언
- 향상된 for문: for(int i : numlist) 또는 for(Integer i : numlist)
- int 사용이 더 효율적 (Auto-boxing 없음)
- Integer 사용 이유: 타입 일관성, 명시적 표현
- Auto-boxing: int → Integer (자동 변환), Auto-unboxing: Integer → int

Q3: 제네릭에 대한 설명과 List<Integer> 사용 이유
A3: 제네릭과 래퍼 클래스
- 제네릭: 타입을 매개변수로 받는 기능, 타입 안전성 보장
- List<int> 불가능 (원시 타입), List<Integer> 가능 (래퍼 클래스)
- 이유: 제네릭은 객체 타입만 지원, 원시 타입은 지원하지 않음
- Auto-boxing으로 편리하게 사용 가능

Q4: List 방식 vs Arrays.stream 방식 차이점과 장단점
A4: 두 방식의 상세 비교
- List 방식: 이해하기 쉬움, 중간 결과 확인 가능, 메모리 오버헤드
- Arrays.stream 방식: 코드 간결, 메모리 효율적, 성능 좋음
- 성능: 기초 배열 방식 < List 방식 < Arrays.stream 방식
- 학습 단계별 추천: 초급(배열) → 중급(List) → 고급(Stream)

=== 핵심 포인트 ===
1. 제네릭은 객체 타입만 지원 (int 불가, Integer 가능)
2. Auto-boxing/Unboxing으로 원시 타입과 래퍼 클래스 자동 변환
3. Stream API가 가장 효율적이지만 학습 단계에서는 기초부터
4. 각 방식마다 장단점이 있으므로 상황에 맞게 선택
*/

