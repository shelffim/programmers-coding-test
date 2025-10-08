import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] myChar = myString.toCharArray();
        int patLen = pat.length();
        for(int i = 0; i < myChar.length - patLen + 1; i++) {
            String copyString = String.valueOf(Arrays.copyOfRange(myChar, i, i + patLen));
            if (copyString.equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}

// String.startsWith() 메서드 사용
// String.indexOf() 메서드 사용
