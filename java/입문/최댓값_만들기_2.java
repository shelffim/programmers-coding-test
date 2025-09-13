import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int minMul = numbers[0] * numbers[1];
        int maxMul = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        int answer = minMul > maxMul ? minMul : maxMul;
        return answer;
    }
}