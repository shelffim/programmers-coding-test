import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        StringBuilder sb = new StringBuilder();
        
        // 약수 구하기
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sb.append(i + ",");
            }
        }
        
        String[] strArr = sb.toString().split(",");
        answer = new int[strArr.length];
        
        // 약수 int로 형변환하기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}

/*
 * 개선 코드 (List와 stream 사용하지 않고 기본 문법만 사용):
 * 
 * import java.util.Arrays;
 * 
 * class Solution {
 *     public int[] solution(int n) {
 *         // 1단계: 약수 개수 계산
 *         int count = 0;
 *         for (int i = 1; i <= n; i++) {
 *             if (n % i == 0) {
 *                 count++;
 *             }
 *         }
 *         
 *         // 2단계: 배열 생성 및 약수 저장
 *         int[] answer = new int[count];
 *         int index = 0;
 *         for (int i = 1; i <= n; i++) {
 *             if (n % i == 0) {
 *                 answer[index++] = i;
 *             }
 *         }
 *         
 *         // 3단계: 정렬
 *         Arrays.sort(answer);
 *         
 *         return answer;
 *     }
 * }
 * 
 * 
 * 약수를 두 번 계산하는 개선 코드가 기존 코드보다 효율적인 이유:
 * 
 * 1. 연산 비용 비교:
 *    - 기존: 정수 연산 + 문자열 연결 + split + parseInt = O(n) + O(n) + O(n) + O(n)
 *    - 개선: 정수 연산 + 정수 연산 = O(n) + O(n)
 * 
 * 2. 메모리 사용량:
 *    - 기존: StringBuilder + String[] + int[] = 3배 메모리 사용
 *    - 개선: int[] = 1배 메모리 사용
 * 
 * 3. 연산 타입:
 *    - 기존: 정수 연산 + 문자열 연산 (문자열 연산이 훨씬 비쌈)
 *    - 개선: 정수 연산만 (CPU에서 가장 빠른 연산)
 * 
 * 4. 가비지 컬렉션:
 *    - 기존: 많은 문자열 객체 생성으로 GC 부담 증가
 *    - 개선: 최소한의 객체 생성으로 GC 부담 감소
 * 
 * 결론: 약수를 두 번 계산하더라도 정수 연산의 효율성이 문자열 연산의 비효율성을 상회함
 */