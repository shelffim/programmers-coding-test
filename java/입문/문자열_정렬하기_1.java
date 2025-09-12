import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        String numbers = "0123456789";
        StringBuilder sb = new StringBuilder();
        
        // 문자열에서 숫자만 StringBuilder에 넣기
        for (char c: my_string.toCharArray()) {
            if (numbers.indexOf(c) != -1) {
                sb.append(numbers.indexOf(c));
            }

        }
        // StringBuilder 객체 String으로 형변환
        String numberString = sb.toString();
        // String 배열로 변환
        String[] numberArray = numberString.split("");
        answer = new int[numberArray.length];
        // String 배열에 있는 값 int로 변환 후 int 배열에 대입
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(numberArray[i]);
        }
        // int 배열 정렬
        Arrays.sort(answer);
        return answer;
    }
}

/*
AI 도움 - 더 효율적인 방법 (Stream, List 사용 안함):

public int[] solution(String my_string) {
    // 1. 숫자 개수 세기
    int count = 0;
    for (char c : my_string.toCharArray()) {
        if (c >= '0' && c <= '9') {
            count++;
        }
    }
    
    // 2. 숫자만 담을 배열 생성
    int[] answer = new int[count];
    int index = 0;
    
    // 3. 숫자만 추출해서 배열에 저장
    for (char c : my_string.toCharArray()) {
        if (c >= '0' && c <= '9') {
            answer[index++] = c - '0'; // 문자를 숫자로 변환
        }
    }
    
    // 4. 배열 정렬
    Arrays.sort(answer);
    return answer;
}

개선점:
- StringBuilder 제거로 메모리 효율성 향상
- c >= '0' && c <= '9'로 직접 문자 검증 (더 빠름)
- c - '0'으로 문자를 숫자로 직접 변환
- 중간 문자열 배열 생성 과정 제거

Stream을 사용한 방법 (참고용):
Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split(""))
    .mapToInt(Integer::parseInt)
    .sorted()
    .toArray();

replaceAll() 메서드 설명:
- 기능: 정규표현식에 매치되는 모든 부분을 지정된 문자열로 치환
- 문법: String.replaceAll(String regex, String replacement)
- 작동방식:
  1. "[A-Z|a-z]" → 대문자 A-Z 또는 소문자 a-z를 의미하는 정규표현식
  2. "" → 빈 문자열로 치환 (즉, 삭제)
  3. 결과: 알파벳 문자들이 모두 제거되고 숫자만 남음
  
예시:
- 입력: "a1b2c3d4e5f"
- replaceAll("[A-Z|a-z]", "") 실행
- 결과: "12345" (알파벳이 모두 제거됨)
*/
