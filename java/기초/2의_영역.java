import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int n: arr) {
            list.add(n);
        }
        int start = list.indexOf(2);
        int end = list.lastIndexOf(2);
        if (start == -1) {
            return new int[]{-1};
        }
        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i + start);
        }
        return answer;
    }
}