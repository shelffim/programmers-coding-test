class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(char c: rsp.toCharArray()) {
            switch (c) {
                case '2':
                    answer += "0";
                    break;
                case '0':
                    answer += "5";
                    break;
                case '5':
                    answer += "2";
                    break;
            }
        }
        return answer;
    }
}

/*
 * HashMap에 대한 간략한 설명:
 * 
 * HashMap은 키-값(Key-Value) 쌍을 저장하는 자료구조입니다.
 * - put(key, value): 키-값 쌍을 저장
 * - get(key): 키에 해당하는 값을 조회 (없으면 null 반환)
 * - 평균 O(1) 시간 복잡도로 빠른 조회 가능
 * - 해시 테이블을 기반으로 구현되어 있음
 * 
 * 가위바위보 문제에서 HashMap을 사용하면:
 * - 각 입력값("2", "0", "5")에 대한 승리 조건을 명확하게 매핑
 * - switch-case문보다 코드가 간결하고 가독성이 좋음
 * - 새로운 규칙 추가가 쉬움
 * 
 * 예시:
 * Map<String, String> winNumbers = new HashMap<>();
 * winNumbers.put("2", "0");  // 가위(2)를 이기는 것은 바위(0)
 * winNumbers.put("0", "5");  // 바위(0)를 이기는 것은 보(5)
 * winNumbers.put("5", "2");  // 보(5)를 이기는 것은 가위(2)
 */