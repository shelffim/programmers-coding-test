class Solution {
    public int solution(int a, int b) {
        int AB = Integer.parseInt("" + a + b);
        int BA = Integer.parseInt("" + b + a);
        return AB > BA ? AB : BA;
    }
}