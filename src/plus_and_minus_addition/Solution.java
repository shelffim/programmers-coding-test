package plus_and_minus_addition;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                "solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}) = " + solution.solution(
                        new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
}
