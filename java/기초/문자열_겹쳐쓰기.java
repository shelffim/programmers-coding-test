class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder replace_string = new StringBuilder();
        replace_string.append(my_string.substring(0,s));
        replace_string.append(overwrite_string);
        replace_string.append(my_string.substring(overwrite_string.length() + s));
        return String.valueOf(replace_string);
    }
}

/*
String.replace() vs StringBuilder.replace() 차이점:

1. String.replace(oldStr, newStr):
   - 문자열 내용을 기준으로 첫 번째로 발견된 부분만 교체
   - 위치를 정확히 지정할 수 없음
   - 예: "abcabc".replace("abc", "xyz") → "xyzabc" (첫 번째 abc만 교체)

2. StringBuilder.replace(start, end, str):
   - 인덱스 위치를 정확히 지정하여 교체
   - start부터 end 전까지의 범위를 str로 교체
   - 예: sb.replace(3, 6, "xyz") → 인덱스 3,4,5를 "xyz"로 교체
*/