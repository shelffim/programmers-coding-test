package numbers_with_x_interval;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(-4, 2);
    }
}
