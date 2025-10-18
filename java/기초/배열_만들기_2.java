import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> onlyFive = new ArrayList<>();
        for (int i = l ; i <= r; i += 5) {
            if (isFive(i)) {
                onlyFive.add(i);
            }
        }
        
        if (onlyFive.size() == 0) {
            onlyFive.add(-1);
        }
        
        int[] answer = new int[onlyFive.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = onlyFive.get(i);
        }
        return answer;
    }
    
    private boolean isFive(int num) {
        for(char c : (num + "").toCharArray()) {
            if (c != '5' && c != '0') {
                return false;
            }
        }
        
        return true;
    }
}