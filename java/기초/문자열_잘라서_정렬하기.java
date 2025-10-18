import java.util.Arrays;
import java.util.ArrayList;


class Solution {
    public String[] solution(String myString) {
        char splitString = 'x';
        ArrayList<String> list = new ArrayList();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == splitString) {
                if (a.length() > 0) {
                    list.add(a.toString());
                    a.setLength(0);
                }
                continue;
            } else if (i == myString.length() - 1) {
                a.append(myString.charAt(i));
                list.add(a.toString());
                break;
            }
            
            a.append(myString.charAt(i));
        }
        String[] answer = list.toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}

/*
 * ============================================================
 * [StringTokenizer란?]
 * ============================================================
 * 
 * - 정의: java.util 패키지의 문자열을 토큰(token) 단위로 분리하는 클래스
 * - 용도: 문자열을 특정 구분자(delimiter)를 기준으로 나누어 처리
 * - import java.util.StringTokenizer; 필요
 * 
 * 주요 메서드:
 *   1. StringTokenizer(String str, String delim)
 *      - 생성자: str을 delim 구분자로 분리
 *      - 예: new StringTokenizer("a x b x c", "x") → ["a ", " b ", " c"]
 * 
 *   2. int countTokens()
 *      - 남아있는 토큰의 개수 반환
 *      - nextToken() 호출 시마다 개수 감소
 * 
 *   3. String nextToken()
 *      - 다음 토큰을 반환하고 내부 포인터 이동
 *      - 더 이상 토큰이 없으면 NoSuchElementException 발생
 * 
 *   4. boolean hasMoreTokens()
 *      - 남은 토큰이 있는지 확인 (있으면 true)
 * 
 * 특징:
 *   ✓ 연속된 구분자는 하나로 처리 (빈 문자열 무시)
 *     예: "axxb" → ["a", "b"]  (중간의 빈 문자열 제외)
 *   ✓ String.split()보다 빠름 (정규식 미사용)
 *   ✓ 메모리 효율적 (필요할 때만 토큰 생성)
 *   ✗ 빈 토큰을 보존하려면 String.split() 사용 권장
 * 
 * String.split() vs StringTokenizer:
 *   - split("x"): "axxb" → ["a", "", "b"]  (빈 문자열 포함)
 *   - StringTokenizer: "axxb" → ["a", "b"]  (빈 문자열 제외)
 * 
 * ============================================================
 * [StringTokenizer를 사용한 대체 방법]
 * ============================================================
 * 
 * StringTokenizer st = new StringTokenizer(myString, "x");  // "x"를 구분자로 문자열 분리
 * int idx = 0, N = st.countTokens();  // 토큰 개수 저장
 * String[] result = new String[N];    // 토큰을 저장할 배열 생성
 * for (int n = 0; n < N; n++)
 *     result[idx++] = st.nextToken(); // 각 토큰을 배열에 저장
 * Arrays.sort(result);                // 배열 사전순 정렬
 * return result;                      // 정렬된 배열 반환
 * 
 * 요약: StringTokenizer로 "x" 기준 분리 → 배열에 저장 → 정렬 → 반환
 * 
 * 예시:
 *   입력: "axbxcxxd"
 *   1. StringTokenizer 생성: ["a", "b", "c", "d"] (빈 문자열 자동 제거)
 *   2. countTokens(): 4
 *   3. 배열 저장: result = ["a", "b", "c", "d"]
 *   4. 정렬: ["a", "b", "c", "d"]
 *   5. 반환: ["a", "b", "c", "d"]
 */