class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if( eq.equals("=")) {
            answer = n == m ? 1 : 0;
        }
        if (ineq.equals(">")) {
            answer += n > m ? 1 : 0;
        } else {
            answer += n < m ? 1 : 0;
        }
        
        return answer > 0 ? 1 : 0;
    }
}

/*
 * Q: 다른 사람이 푼 코드의 Map<String, BiFunction<Integer, Integer, Boolean>> functions와 작동 방식 설명
 * A: Map.of()로 불변 Map 생성, BiFunction으로 두 정수를 받아 boolean 반환하는 람다 함수들 저장.
 *    functions.get(ineq + eq).apply(n, m)로 문자열 연결 후 해당 함수를 가져와 n, m을 전달하여 비교 연산 수행.
 *    삼항 연산자로 boolean을 int로 변환하여 반환. 전략 패턴의 함수형 구현으로 if-else보다 간결하고 확장 가능.
 * 
 * Q: BiFunction 인터페이스와 apply 메서드에 대한 자세한 설명
 * A: BiFunction<T,U,R>은 두 개의 입력값(T, U)을 받아 하나의 결과(R)를 반환하는 함수형 인터페이스.
 *    apply(T t, U u) 메서드가 핵심으로 실제 연산 로직이 구현되는 곳.
 *    Map과 함께 사용하여 조건부 로직을 깔끔하게 구현할 수 있으며, 람다 표현식으로 간결하게 작성 가능.
 */