package sum_of_divisors;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        return IntStream.range(1, n + 1).filter(i -> n % i == 0).sum();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(12) = " + solution.solution(12));
    }
}
