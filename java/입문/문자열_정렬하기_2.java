import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] answer = my_string.toLowerCase().toCharArray();
        Arrays.sort(answer);
        return String.valueOf(answer);
    }
}

/*
 * Locale.ROOT 사용에 대한 설명
 * 
 * 원본 코드: myString.toLowerCase(Locale.ROOT)
 * 
 * 1. Locale.ROOT를 사용하는 이유:
 *    - 언어 중립적인 소문자 변환을 보장
 *    - 시스템 로케일에 관계없이 일관된 결과 제공
 * 
 * 2. 언어별 차이점:
 *    - 터키어: "İ" → "i", "I" → "ı"
 *    - 영어: "İ" → "i", "I" → "i"
 *    - 기본 toLowerCase(): 시스템 로케일에 따라 다름
 * 
 * 3. 프로그래밍 문제에서 중요한 이유:
 *    - 채점 서버가 다른 로케일에서 실행될 수 있음
 *    - 개발자 환경과 다른 로케일일 수 있음
 *    - 일관된 정렬 결과 보장 (sorted() 메서드와 함께 사용)
 * 
 * 4. 예시:
 *    "İ".toLowerCase()           // 터키어 시스템에서 "i" (터키어)
 *    "İ".toLowerCase(Locale.ROOT) // 항상 "i" (영어 기준)
 * 
 * 5. 권장사항:
 *    - 프로그래밍 문제에서는 Locale.ROOT 사용 권장
 *    - 국제화가 필요한 애플리케이션에서 일관성 보장
 */