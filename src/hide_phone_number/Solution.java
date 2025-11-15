package hide_phone_number;

public class Solution {
    public String solution(String phone_number) {
        int phone_number_length = phone_number.length();
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(phone_number_length - 4))
                .append(phone_number.substring(phone_number_length - 4, phone_number_length));
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("01033334444"));
    }
}
