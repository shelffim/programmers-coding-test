import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String my_string) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> alphaMap = new HashMap<>();
        for(char c: alpha.toCharArray()) {
            alphaMap.put(c,0);
        }
        for(char c: my_string.toCharArray()) {
            int count = alphaMap.get(c);
            alphaMap.put(c, count + 1);
        }
        List<Integer> count_list = new ArrayList<>(alphaMap.values());
        int[] answer = new int[count_list.size()];
        for (int i = 0; i < count_list.size(); i++) {
            answer[i] = count_list.get(i);
        }
        return answer;
    }
}