class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] cipherArr = cipher.toCharArray();
        for(int i = code - 1; i < cipherArr.length; i += code) {
            answer += String.valueOf(cipherArr[i]);
        }
        return answer;
    }
}

/*
 * charAt() 메서드에 대한 설명:
 * 
 * String.charAt(int index)는 문자열에서 지정된 인덱스 위치의 문자를 반환하는 메서드입니다.
 * 
 * 사용법: string.charAt(index)
 * - string: 대상 문자열
 * - index: 가져올 문자의 인덱스 (0부터 시작)
 * 
 * 예시:
 * String str = "Hello";
 * char ch = str.charAt(0);  // 'H' 반환
 * char ch2 = str.charAt(4); // 'o' 반환
 * 
 * 주의사항:
 * - 인덱스는 0부터 시작합니다
 * - 인덱스가 문자열 길이를 벗어나면 StringIndexOutOfBoundsException이 발생합니다
 * - 반환값은 char 타입입니다
 * 
 * 현재 코드에서는 toCharArray()를 사용했지만, charAt()을 사용한다면:
 * for(int i = code - 1; i < cipher.length(); i += code) {
 *     answer += cipher.charAt(i);
 * }
 * 이렇게 작성할 수도 있습니다.
 */