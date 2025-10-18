class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        int[] answer = new int[strArr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strArr[i].length();
        }
        return answer;
    }
}