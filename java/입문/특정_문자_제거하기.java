class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();

        for (char c: my_string.toCharArray()) {
            String s = String.valueOf(c);
            if (letter.equals(s)) {
                continue;
            }
            
            answer.append(s);
        }
        return answer.toString();
        
    }
}

 // replace 메서드를 사용한 더 간단한 방법:
// return my_string.replace(letter, "");

// replace() 메서드 설명:
// - String 클래스의 메서드로, 문자열에서 특정 문자나 문자열을 다른 문자나 문자열로 교체
// - 첫 번째 매개변수: 교체할 대상 (letter)
// - 두 번째 매개변수: 교체할 내용 (빈 문자열 ""로 설정하면 제거 효과)
// - 모든 일치하는 부분을 교체 (replaceAll과 동일한 동작)
// - 원본 문자열은 변경되지 않고 새로운 문자열을 반환
 