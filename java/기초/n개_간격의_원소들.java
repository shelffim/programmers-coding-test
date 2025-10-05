class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - 1) / n + 1];
        for (int idx = 0, i = 0; i < num_list.length; idx++, i += n) {
            answer[idx] = num_list[i];
        }
        return answer;
    }
}