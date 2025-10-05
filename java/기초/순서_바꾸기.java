import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] before = Arrays.copyOfRange(num_list, 0, n);
        int[] after = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] answer = new int[num_list.length];
        int count = 0;
        for(int i = 0;  i < after.length; i++) {
            answer[count++] = after[i];
        }
        for(int i = 0;  i < before.length; i++) {
            answer[count++] = before[i];
        }
        
        return answer;
    }
}