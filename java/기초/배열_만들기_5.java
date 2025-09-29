import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String ss: intStrs) {
            String sl = ss.substring(s, s + l);
            int si = Integer.parseInt(sl);
            if (si > k) {
                list.add(si);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}