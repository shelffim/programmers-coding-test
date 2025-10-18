class Solution {
    public String solution(String letter) {
        String answer = "";
                String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] letterArr = letter.split(" ");
        for(String l: letterArr) {
            for (int i = 0; i < morse.length; i++) {
                if (l.equals(morse[i])) {
                    answer += (char) (i + 97 ) + "";
                }
            }
        }
        
        return answer;
    }
}

/*
HashMap 주요 기능:
- 키-값 쌍 저장 및 빠른 검색 (O(1) 시간복잡도)
- 해시 함수를 이용한 데이터 매핑

주요 메서드:
- put(key, value): 데이터 저장
- get(key): 데이터 조회
- containsKey(key): 키 존재 확인
- remove(key): 데이터 삭제
- size(): 크기 반환

장단점:
- 장점: 매우 빠른 검색 속도, 직관적인 키-값 구조
- 단점: 순서 보장 안됨, 메모리 사용량 많음, 동기화 안됨

HashMap 초기화 방법:
1. new HashMap<>() {{ put("key", "value"); }}; (익명 내부 클래스)
2. Map.of("key1", "value1", "key2", "value2"); (Java 9+, 최대 10개)
3. Map.ofEntries(Map.entry("key", "value")); (Java 9+, 무제한)
4. 정적 메서드로 초기화 후 반환
*/