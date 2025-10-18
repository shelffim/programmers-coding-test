class Solution {
    public String[] solution(String myStr) {
        String[] strArr = myStr.split("[abc]+");
        int count = 0;
        for(String s: strArr) {
            if (s.isEmpty()) {
                count++;
            }
        }
        String[] answer = new String[strArr.length - count];
        for(int idx = 0, i = 0; i < strArr.length; i++) {
            if (!strArr[i].isEmpty()) {
                answer[idx++] = strArr[i];
            }
        }
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}