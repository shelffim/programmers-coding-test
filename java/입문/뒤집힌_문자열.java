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
 */