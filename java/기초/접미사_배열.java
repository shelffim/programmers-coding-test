import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(Comparator.naturalOrder());
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}