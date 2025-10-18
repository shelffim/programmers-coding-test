import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String s: strArr) {
            if (s.contains("ad")) {
                continue;
            }
            answer.add(s);
        }
        return answer.toArray(String[]::new);
    }
}