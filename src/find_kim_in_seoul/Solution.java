package find_kim_in_seoul;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String findFirstName = "Kim";

    public String solution(String[] seoul) {
        List<String> seoulList = new ArrayList<>(List.of(seoul));
        return "김서방은 " + seoulList.indexOf(findFirstName) + "에 있다";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(new String[]{\"Jane\", \"Kim\"}) = " + solution.solution(
                new String[]{"Jane", "Kim"}));
    }
}
