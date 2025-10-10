import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> skt = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            if (skt.isEmpty()) {
                skt.add(arr[i]);
                continue;
            }
            
            if (skt.get(skt.size() - 1) == arr[i]) {
                skt.remove(skt.size() - 1);
            } else {
                skt.add(arr[i]);
            }
        }
        int[] answer = new int[skt.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = skt.get(i);
        }
        return answer.length != 0 ? answer : new int[]{-1};
    }
}