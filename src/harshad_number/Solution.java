package harshad_number;

public class Solution {
    public boolean solution(int x) {
        int sum = getSum(x);
        return x % sum == 0;
    }

    private static int getSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(10) = " + solution.solution(10));
    }
}
