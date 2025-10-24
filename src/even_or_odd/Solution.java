package even_or_odd;

class Solution {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3);
    }
}
