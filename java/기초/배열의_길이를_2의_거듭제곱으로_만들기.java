class Solution {
    public int[] solution(int[] arr) {
        int arrLen = 1;
        while (arrLen < arr.length) {
            arrLen *= 2;
        }
        if (arr.length == arrLen) {
            return arr;
        }
        int[] answer = new int[arrLen];
        int i = 0;
        for (; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        for (; i < answer.length; i++) {
            answer[i] = 0;
        }
        return answer;
    }
}