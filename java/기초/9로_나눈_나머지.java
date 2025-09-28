class Solution {
    public int solution(String number) {
        int answer = 0;
        for(char n: number.toCharArray()) {
            answer += Integer.parseInt(n + "") % 9;
        }
        return answer % 9;
    }
}