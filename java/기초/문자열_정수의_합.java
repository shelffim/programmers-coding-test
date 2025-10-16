class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(char c: num_str.toCharArray()) {
            answer += Integer.parseInt(c + "");
        }
        return answer;
    }
}


/*
* Stream API를 사용한 간결한 해결책
* numStr.chars().map(c -> c - 48).sum() 작동방식과 메서드 기능 설명:
* 
* 1. numStr.chars()
*    - String의 chars() 메서드는 IntStream을 반환
*    - 문자열의 각 문자를 ASCII/Unicode 값(int)으로 변환하여 스트림으로 제공
*    - 예: "123" → [49, 50, 51] (ASCII 값)
* 
* 2. .map(c -> c - 48)
*    - 각 ASCII 값을 실제 숫자로 변환
*    - 문자 '0'의 ASCII 값은 48이므로, c - 48을 하면:
*      - '0' (ASCII 48) → 48 - 48 = 0
*      - '1' (ASCII 49) → 49 - 48 = 1
*      - '2' (ASCII 50) → 50 - 48 = 2
*      - '9' (ASCII 57) → 57 - 48 = 9
* 
* 3. .sum()
*    - IntStream의 모든 요소를 더한 값을 반환
*    - 최종적으로 문자열의 모든 숫자를 더한 합계를 구함
* 
* 전체 과정 예시:
* "123" → chars() → [49, 50, 51] → map(c -> c - 48) → [1, 2, 3] → sum() → 6
*/
        
