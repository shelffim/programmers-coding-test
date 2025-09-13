class Solution {
    public String solution(String my_string, int num1, int num2) {
        String start = my_string.substring(0, num1);
        String end = my_string.substring(num2 + 1);
        String num1String = my_string.substring(num1, num1 + 1);
        String num2String = my_string.substring(num2, num2 + 1);
        String num1Tonum2 = my_string.substring(num1 + 1, num2);
        
        String answer = start + num2String + num1Tonum2 + num1String + end;
        return answer;
    }
}

/*
 * my_string.charAt(index): 
 * - 문자열에서 지정된 인덱스 위치의 문자 하나를 반환하는 메서드
 * - 예: "hello".charAt(1) → 'e'
 * 
 * Collections.swap(list, i, j):
 * - 리스트에서 두 인덱스의 요소를 서로 바꾸는 메서드
 * - 예: Collections.swap(list, 0, 2) → 0번째와 2번째 요소 교체
 */