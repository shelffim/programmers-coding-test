class Solution {
    public int solution(int order) {
        int answer = 0;
        for(char o: String.valueOf(order).toCharArray()) {
            if (o == '3' || o == '6' || o == '9') {
                answer++;
            }
        }
        return answer;
    }
}