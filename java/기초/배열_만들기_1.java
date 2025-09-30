class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for(int idx = 0, i = k; i <= n; i += k, idx++) {
            answer[idx] = i;
        }
        return answer;
    }
}