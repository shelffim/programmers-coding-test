class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int repetiton = (a==b) && (b==c) ? 3 : ((a==b) || (b==c) || (a==c) ? 2 : 1);
        for(int i = 1; i <= repetiton; i++) {
            answer *= Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i);
        }
        return answer;
    }
}