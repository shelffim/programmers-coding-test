import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).sum();
        return answer / numbers.length;
    }
}

// Arrays.stream(), sum(), average(), orElse(0), 리스트와 컬렉션의 차이, Arrays.asList(), 배열이랑 리스트 차이, 람다식 메소드 참조