class Solution {
    public int solution(int price) {
        int answer = price;
        final int DCA = 500_000;
        final int DCB = 300_000;
        final int DCC = 100_000;
        
        if (price >= DCA) {
            answer = (int) (price * 0.8);
        } else if (price >= DCB) {
            answer = (int) (price * 0.9);
        } else if (price >= DCC) {
            answer = (int) (price * 0.95);
        }
    
        return answer;
    }
}