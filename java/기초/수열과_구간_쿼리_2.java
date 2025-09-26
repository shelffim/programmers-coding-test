class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for(int[] query: queries) {
            Integer min = null;
            for (int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2]) {
                    if (min == null || min > arr[i]) {
                        min = arr[i];
                    }
                }
            }
            answer[idx++] = (min != null ? min : -1);
        }
        return answer;
    }
}