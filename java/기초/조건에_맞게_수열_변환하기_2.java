import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (answer >= 0) {
            int[] copy_arr = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, copy_arr)) {
                break;
            }
            answer++;
            
        }
        return answer;
    }
}