package check_integer_square_root;

public class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(121) = " + solution.solution(121));
    }
}
