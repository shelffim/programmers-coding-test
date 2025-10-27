package harshad_number;

public class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(Character::getNumericValue).sum();
        return x % sum == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(10) = " + solution.solution(10));
    }
}
