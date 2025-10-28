package divisible_numbers_array;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if (answer.length == 0) {
            return new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                "solution.solution(new int[]{5,9,7,10}, 5) = " + solution.solution(new int[]{5, 9, 7, 10}, 5));
    }
}
