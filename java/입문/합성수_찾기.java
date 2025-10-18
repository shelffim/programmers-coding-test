class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            // 약수 개수 구하기
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // 합성수 개수 구하기
            if(count >= 3) {
                answer++;
            }
        }
        return answer;
    }
}