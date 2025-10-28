package p_and_y_count_in_string;

public class Solution {
    boolean solution(String s) {
        String lowerS = s.toLowerCase();
        return lowerS.chars().filter(c -> c == 'y').count() == lowerS.chars().filter(c -> c == 'p').count();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("pPoooyYy");
    }
}
