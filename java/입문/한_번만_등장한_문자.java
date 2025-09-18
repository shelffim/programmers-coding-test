import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.length() - s.replace(""+c,"").length() == 1) {
                answer += c + "";
            }
        }
        
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        
        return String.valueOf(chars);
    }
}