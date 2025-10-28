package add_missing_numbers;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] numbers) {
        boolean[] check = new boolean[10];
        int answer = 0;
        for (int number : numbers) {
            check[number] = true;
        }
        for (int i = 0; i < 10; i++) {
            if (!check[i]) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}) = " + solution.solution(
                new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
