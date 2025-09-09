class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i ==0) {
                answer++;
            }
        }
        return answer;
    }
}

/*
 * Q: 다른 사람이 IntStream을 사용한 이유와 사용법은?
 * A: (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
 * 
 * IntStream 사용 이유:
 * 1. 함수형 프로그래밍 스타일 - 선언적 접근으로 가독성 향상
 * 2. 체이닝을 통한 간결한 코드 작성
 * 3. 병렬 처리 가능성 (.parallel() 추가 가능)
 * 
 * 사용법 분석:
 * - rangeClosed(1, n): 1부터 n까지(포함) 정수 스트림 생성
 * - filter(i -> n % i == 0): n의 약수만 필터링
 * - count(): 필터링된 요소 개수 반환 (long 타입)
 * - (int): long을 int로 캐스팅
 * 
 * 성능 비교:
 * - for문: O(n), 약간 더 빠름, 메모리 O(1)
 * - IntStream: O(n), 약간의 오버헤드, 메모리 O(1) (지연 평가)
 * 
 * 결론: 단순한 경우엔 for문이 적절, 복잡한 조건 체이닝시 IntStream 유리
 */