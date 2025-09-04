class Solution {
    public String solution(String my_string) {
        // 방법 1: 반복문을 사용한 문자열 뒤집기 (현재 구현)
        String answer = "";
        for(int i = my_string.length() - 1; i >= 0;i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

/*
 * StringBuilder 클래스 설명:
 * - java.lang 패키지의 가변(mutable) 문자열 클래스
 * - String과 달리 기존 문자열을 수정할 수 있음
 * - 문자열 조작이 String보다 훨씬 효율적 (불필요한 객체 생성 최소화)
 * 
 * 메서드 체이닝이 가능한 이유:
 * - reverse() 메서드가 새로운 객체를 만들지 않고 자기 자신(this)을 반환
 * - 각 메서드가 객체를 반환하므로 연속적으로 메서드 호출 가능
 * - new StringBuilder(my_string).reverse().toString() 형태로 간결하게 작성 가능
 * 
 * StringBuilder vs StringBuffer 차이점:
 * 1. 동기화(Synchronization):
 *    - StringBuilder: 동기화되지 않음 (Thread-unsafe) → 빠름
 *    - StringBuffer: 동기화됨 (Thread-safe) → 느림
 * 2. 사용 시나리오:
 *    - StringBuilder: 단일스레드 환경, 성능 우선 (일반적인 경우)
 *    - StringBuffer: 멀티스레드 환경, 안전성 우선
 * 3. 성능: StringBuilder > StringBuffer > String (문자열 연결 시)
 * 4. 결론: 프로그래머스 코딩테스트에서는 StringBuilder 사용 권장
 */