class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        for (int i = 0; i < arr.length; i++) {
            int num = answer[i];
            if(num % 2 == 0 && num >= 50) {
                answer[i] = num / 2;
            } else if (num % 2 == 1 && num < 50) {
                answer[i] = num * 2;
            }
        }
        return answer;
    }
}