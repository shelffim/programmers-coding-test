import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]; j++) {
                    deque.push(arr[i]);
                    deque.push(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    deque.pop();
                }
            }
        }
        int[] answer = new int[deque.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = deque.pop();
        }
        return answer;
    }
}