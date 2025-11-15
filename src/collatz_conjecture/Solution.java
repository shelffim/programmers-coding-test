package collatz_conjecture;

public class Solution {
    public int solution(int num) {
        long longNum = num;

        for (int count = 0; count < 500; count++) {
            if (longNum == 1) {
                return count;
            }
            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(626331));
    }
}
