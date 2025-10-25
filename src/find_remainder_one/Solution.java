package find_remainder_one;

public class Solution {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(12) = " + solution.solution(12));
    }
}
