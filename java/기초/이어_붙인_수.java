class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();
        for(int n: num_list) {
            if(n % 2 == 0) {
                evenNum.append(n);
            } else {
                oddNum.append(n);
            }
        }
        return Integer.valueOf(new String(oddNum)) + Integer.valueOf(new String(evenNum));
    }
}