class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c: my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }
        return answer;
    }
}

/*
 * 스트림 방식으로 해결하는 방법:
 * my_string.chars().filter(Character::isDigit).map(v->v - 48).sum();
 * 
 * 각 메서드 설명:
 * 1. chars(): 문자열을 IntStream으로 변환 (각 문자를 ASCII 값으로)
 * 2. filter(Character::isDigit): 숫자 문자만 필터링
 * 3. map(v->v - 48): ASCII 값을 실제 숫자로 변환 ('0'=48이므로 48을 빼면 실제 숫자)
 * 4. sum(): 모든 숫자의 합을 구함
 * 
 * 예시: "a1b2c3" → [97,49,98,50,99,51] → [49,50,51] → [1,2,3] → 6
 * 
 * 장점: 간결하고 함수형 프로그래밍 스타일, 의도가 명확
 * 단점: 스트림 오버헤드로 인한 약간의 성능 저하
 */