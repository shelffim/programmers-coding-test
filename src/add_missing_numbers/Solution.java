package add_missing_numbers;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        int answer = 0;
        for (int number : numbers) {
            numberSet.remove(number);
        }
        for (Integer num : numberSet) {
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}) = " + solution.solution(
                new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
