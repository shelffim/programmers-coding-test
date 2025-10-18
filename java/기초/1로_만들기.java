class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int n: num_list) {
            while (n != 1) {
                n = (n % 2 == 0 ? n : (n - 1)) / 2;
                answer++;
            }
        }
        return answer;
    }
}

/*
 * Integer.toBinaryString(i).length() - 1 로직 설명:
 * 
 * 이 로직은 숫자를 이진수로 변환했을 때의 비트 길이에서 1을 뺀 값이 
 * 해당 숫자를 1로 만들기 위한 연산 횟수라는 수학적 원리를 활용합니다.
 * 
 * 핵심 아이디어:
 * - 숫자 n의 이진수 표현에서 가장 왼쪽 1의 위치는 ⌊log₂(n)⌋ + 1
 * - 이 값에서 1을 빼면 ⌊log₂(n)⌋가 되는데, 이는 해당 숫자를 2로 나누어 1로 만들기 위한 횟수
 * 
 * 예시:
 * 1. 숫자 8: Integer.toBinaryString(8) → "1000" → length() = 4 → 4-1 = 3
 *    8을 1로 만드는 과정: 8 → 4 → 2 → 1 (총 3번의 연산)
 * 
 * 2. 숫자 7: Integer.toBinaryString(7) → "111" → length() = 3 → 3-1 = 2  
 *    7을 1로 만드는 과정: 7 → 3 → 1 (총 2번의 연산)
 * 
 * 3. 숫자 4: Integer.toBinaryString(4) → "100" → length() = 3 → 3-1 = 2
 *    4를 1로 만드는 과정: 4 → 2 → 1 (총 2번의 연산)
 * 
 * 효율적인 대안 코드:
 * return Arrays.stream(num_list)
 *     .map(i -> Integer.toBinaryString(i).length() - 1)
 *     .sum();
 * 
 * 이 방법의 장점:
 * - O(1) 시간 복잡도로 각 숫자의 연산 횟수를 계산
 * - 반복문이나 나눗셈 연산 없이 비트 길이만으로 해결
 * - 매우 영리한 수학적 접근법
 */