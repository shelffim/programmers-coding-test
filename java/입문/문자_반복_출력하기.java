class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(String c: my_string.split("")) {
            for(int i = 0; i < n; i++) {
                answer += c;
            }
        }
        return answer;
    }
}

/*
=== StringBuilder에 대한 설명 ===
StringBuilder는 문자열을 효율적으로 조작하기 위한 클래스입니다.

1. 왜 StringBuilder를 사용하나요?
   - String은 불변(immutable) 객체입니다
   - String + 연산자는 매번 새로운 String 객체를 생성합니다
   - 예: "hello" + "world" → 새로운 String 객체 생성
   - 반복문에서 문자열 연결 시 성능이 매우 떨어집니다

2. StringBuilder의 장점:
   - 내부 버퍼를 사용하여 문자열을 효율적으로 조작
   - append() 메서드로 문자열을 추가
   - toString()으로 최종 String 객체 생성

3. 사용 예시:
   StringBuilder sb = new StringBuilder();
   sb.append("Hello");
   sb.append("World");
   String result = sb.toString(); // "HelloWorld"

=== repeat() 메서드에 대한 설명 ===
String.repeat(int count)는 Java 11에서 추가된 메서드입니다.

1. 기능:
   - 문자열을 지정된 횟수만큼 반복합니다
   - 예: "a".repeat(3) → "aaa"

2. 사용법:
   String str = "Hello";
   String repeated = str.repeat(3); // "HelloHelloHello"

3. 주의사항:
   - Java 11 이상에서만 사용 가능
   - count가 0이면 빈 문자열 반환
   - count가 음수면 IllegalArgumentException 발생

=== 문자열을 쪼개서 배열로 만드는 방법들 ===

1. split("") 사용 (현재 코드에서 사용):
   String str = "hello";
   String[] arr = str.split(""); // ["h", "e", "l", "l", "o"]
   - 빈 문자열로 split하면 각 문자가 개별 요소가 됩니다
   - 가장 간단하지만 성능이 좋지 않습니다

2. toCharArray() 사용 (권장):
   String str = "hello";
   char[] arr = str.toCharArray(); // ['h', 'e', 'l', 'l', 'o']
   - char 배열로 변환
   - 가장 효율적입니다

3. Stream API 사용:
   String str = "hello";
   String[] arr = str.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .toArray(String[]::new);
   - 함수형 프로그래밍 스타일
   - 복잡하지만 유연합니다

4. for문으로 직접 분리:
   String str = "hello";
   String[] arr = new String[str.length()];
   for(int i = 0; i < str.length(); i++) {
       arr[i] = String.valueOf(str.charAt(i));
   }
   - 가장 기본적인 방법
   - 성능이 좋습니다
*/