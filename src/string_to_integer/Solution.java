package string_to_integer;

public class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(\"-1234\") = " + solution.solution("-1234"));
    }
}
