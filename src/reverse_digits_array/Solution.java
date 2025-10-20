package reverse_digits_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(long n) {
        if (n == 0) {
            return new int[] {0};
        }

        List<Integer> list = getList(n);

        return getArray(list);
    }

    private int[] getArray(List<Integer> list) {
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private List<Integer> getList(long n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(12345);
    }
}
