import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortEmergency = emergency.clone();
        Arrays.sort(sortEmergency);
        int[] answer = new int[emergency.length];
        for(int i = 0; i < answer.length; i++) {
            for(int j = sortEmergency.length - 1; j >= 0; j--) {
                if(sortEmergency[j] == emergency[i]) {
                    answer[i] = sortEmergency.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}