package get_middle_character;

public class Solution {
    public String solution(String s) {
        int s_len = s.length();
        return String.valueOf(s_len % 2 == 0 ? s.substring(s_len / 2 - 1, s_len / 2 + 1) : s.charAt(s_len / 2));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abcde"));
        System.out.println(solution.solution("qwer"));
    }
}
