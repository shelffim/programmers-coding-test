package divisible_numbers_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                "solution.solution(new int[]{5,9,7,10}, 5) = " + solution.solution(new int[]{5, 9, 7, 10}, 5));
    }
}
