class Solution {
    public int solution(int a, int b) {
        int AB = Integer.parseInt("" + a + b);
        return Math.max(AB, 2 * a * b);
    }
}