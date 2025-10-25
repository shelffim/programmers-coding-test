package string_to_integer;

public class Solution {
    public int solution(String s) {
        int answer;
        String digit = "";
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            digit = s.charAt(0) + "";
            answer = Integer.parseInt(s.replaceAll("[^0-9]",""));
        } else {
            answer = Integer.parseInt(s);
        }
        return digit.equals("-") ? -1 * answer : answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("-1234");
    }
}
