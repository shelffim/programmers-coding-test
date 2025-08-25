class Solution {
    public int solution(int num1, int num2) {
        int answer = (int)((double)num1 / (double)num2 * 1000);
        return answer;
    }
}

// 형 변환 주의
// 자바의 자동형 변환 규칙
// 1. 작은 타입 → 큰 타입으로 자동 변환
// 2. 큰 타입 → 작은 타입은 수동 캐스팅 필요