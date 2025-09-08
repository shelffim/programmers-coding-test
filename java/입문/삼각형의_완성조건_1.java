class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int maxSide = sides[0];
        int sumSide = 0;
        int idx = 0;
        for(int i =1; i < sides.length; i++) {
            if (maxSide < sides[i]) {
                maxSide = sides[i];
                idx = i;
            }
        }
        
        for(int i = 0; i < sides.length; i++) {
            if (idx == i) {
                continue;
            }
            sumSide += sides[i];
        }
        
        if (maxSide < sumSide) {
            answer = 1;
        }
        return answer;
    }
}