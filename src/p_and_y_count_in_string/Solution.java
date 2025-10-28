package p_and_y_count_in_string;

public class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (char c: s.toLowerCase().toCharArray()) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("pPoooyY");
    }
}
