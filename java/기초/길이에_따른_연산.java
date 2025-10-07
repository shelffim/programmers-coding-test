class Solution {
    
    private int sum(int[] num_list) {
        int result = 0;
        for(int n: num_list) {
            result += n;
        }
        return result;
    }
    
    private int mul(int[] num_list) {
        int result = 1;
        for(int n: num_list) {
            result *= n;
        }
        return result;
    }
    
    public int solution(int[] num_list) {
        int size = num_list.length;
        int answer = size >= 11 ? sum(num_list) : mul(num_list);
        return answer;
    }
    
}

// 내부클래스 활용
/* 
class Solution {
    
    // 내부 인터페이스 정의
    interface Calculator {
        int calculate(int[] num_list);
    }
    
    // 합계 계산 내부클래스
    class SumCalculator implements Calculator {
        @Override
        public int calculate(int[] num_list) {
            int result = 0;
            for(int n : num_list) {
                result += n;
            }
            return result;
        }
    }
    
    // 곱셈 계산 내부클래스
    class MultiplyCalculator implements Calculator {
        @Override
        public int calculate(int[] num_list) {
            int result = 1;
            for(int n : num_list) {
                result *= n;
            }
            return result;
        }
    }
    
    public int solution(int[] num_list) {
        Calculator calculator = num_list.length >= 11 ? 
            new SumCalculator() : new MultiplyCalculator();
        
        return calculator.calculate(num_list);
    }
}
 */