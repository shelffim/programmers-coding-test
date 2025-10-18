class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int[] query: queries) {
            int s = query[0], e = query[1], k = query[2];
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    int a = answer[i];
                    answer[i] = a + 1;
                }
            }
        }
        return answer;
    }
}