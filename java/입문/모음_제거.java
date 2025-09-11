class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] moem = {"a","e","i","o","u"};
        for(String m: moem) {
            answer = answer.replace(m,"");
        }
        
        return answer;
    }
}

/*
문제 해결 힌트:
1. replace() 메서드는 새로운 문자열을 반환하므로 결과를 변수에 저장해야 함

더 간단한 해결 방법들:
1. my_string.replaceAll("[aeiou]", "")
   - [aeiou]: 문자 클래스, 대괄호 안의 문자 중 하나와 매칭
   
2. myString.replaceAll("a|e|i|o|u", "")
   - a|e|i|o|u: OR 연산자, 각 문자 중 하나와 매칭
   
두 방법 모두 동일한 결과를 출력하며, [aeiou] 방식이 더 표준적이고 간결함

replace() vs replaceAll() 차이점:
- replace(): 문자열 리터럴을 바꿈 (정규표현식 사용 안함)
  예: str.replace("abc", "xyz") -> "abc"를 "xyz"로 바꿈
- replaceAll(): 정규표현식 패턴을 바꿈
  예: str.replaceAll("[aeiou]", "") -> 모든 모음을 제거
*/