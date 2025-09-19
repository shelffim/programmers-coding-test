class Solution {
    public int solution(int n) {
        int answer = 1;
        for(;;answer++) {
            if(n / answer ==0) {
                break;
            }
            n /= answer;
        }
        return answer - 1;
    }
}