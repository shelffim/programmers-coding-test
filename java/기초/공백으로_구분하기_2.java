import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == ' ') {
                if (a.length() > 0) {
                    answer.add(a.toString());
                    a.setLength(0);
                }
                continue;
            } else if (i == my_string.length() - 1) {
                a.append(my_string.charAt(i));
                answer.add(a.toString());
                break;
            }
            
            a.append(my_string.charAt(i));
        }
        return answer.toArray(String[]::new);
    }
}

// public String[] solution(String my_string) {
//     return my_string.trim().split("\\s+");
//     return my_string.trim().split("[ ]+");
// }