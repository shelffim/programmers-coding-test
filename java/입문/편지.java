class Solution {

    // 매직 넘버 방지
    final static int WORD_WIDTH = 2;

    public int solution(String message) {
        int answer = message.length() * WORD_WIDTH;
        return answer;
    }
}