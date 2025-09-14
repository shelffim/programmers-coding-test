class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        for(int i = 0; i < strAge.length(); i++) {
            char c = strAge.charAt(i);
            answer += (char) ((int) c + 49) + "";
        }
        
        return answer;
    }
}

/*
 * StringBuilder.insert(0, ...) 메서드 설명:
 * 
 * 1. 기본 문법: StringBuilder insert(int offset, char c)
 *    - offset: 삽입할 위치 (인덱스)
 *    - c: 삽입할 문자
 * 
 * 2. insert(0, ...)의 의미:
 *    - 0번째 인덱스(맨 앞)에 값을 삽입
 *    - 기존 모든 요소들이 한 칸씩 뒤로 이동
 * 
 * 3. 작동 방식 예시:
 *    StringBuilder sb = new StringBuilder();
 *    sb.insert(0, 'A');  // "A"
 *    sb.insert(0, 'B');  // "BA" (A가 뒤로 밀림)
 *    sb.insert(0, 'C');  // "CBA" (B, A가 뒤로 밀림)
 * 
 * 4. 외계행성 나이 문제에서의 활용:
 *    - 숫자를 뒤에서부터 처리 (23 → 3, 2)
 *    - insert(0, ...)로 맨 앞에 삽입하여 올바른 순서 유지
 *    - append()를 사용하면 "32"가 되지만, insert(0, ...)를 사용하면 "cd"가 됨
 * 
 * 5. 왜 insert(0, ...)를 사용하나?
 *    - age % 10으로 마지막 자리수를 얻고
 *    - age /= 10으로 마지막 자리수를 제거
 *    - 이 과정을 반복하면 뒤에서부터 앞으로 처리됨
 *    - insert(0, ...)로 맨 앞에 삽입하면 올바른 순서로 결과 생성
 */