class Solution {
    public int solution(int n) {
        boolean isEven = n % 2 == 0;
        int answer = 0;
        if (isEven) {
            for(int i = 2; i <= n; i +=2) {
                answer += (int) Math.pow(i,2);
            }
        } else {
            for(int i = 1; i <= n ; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}