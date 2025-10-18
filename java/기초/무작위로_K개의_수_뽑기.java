import java.util.Iterator;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet();
        for(int a: arr) {
            set.add(a);
        }  
        int[] answer = new int[k];
        int idx = 0;
        Iterator<Integer> iterSet = set.iterator();
        while(iterSet.hasNext() && idx < k) {
            answer[idx++] = iterSet.next();
        }
        for(int i = idx; i < k; i++) {
            answer[i] = -1;
        }
        return answer;
    }
}