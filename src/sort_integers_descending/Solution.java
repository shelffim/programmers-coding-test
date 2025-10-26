package sort_integers_descending;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        char[] n_arr = String.valueOf(n).toCharArray();
        Arrays.sort(n_arr);
        StringBuilder sb = new StringBuilder(new String(n_arr));
        sb.reverse();

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(118372) = " + solution.solution(118372));
    }
}
