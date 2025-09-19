class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numString = my_string.replaceAll("[a-zA-Z]"," ").trim().split("\\s+");
        for(String s: numString) {
            if(!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}