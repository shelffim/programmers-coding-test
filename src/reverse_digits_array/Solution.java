package reverse_digits_array;

public class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();

        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(sb.charAt(i) + "");
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(12345);
    }
}
