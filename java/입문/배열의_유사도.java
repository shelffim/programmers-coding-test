
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String c1: s1) {
            for(String c2: s2) {
                if (c1.equals(c2)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
 * 질문: 다른 사람이 푼 코드 분석
 * Set<String> set = new HashSet<>(Arrays.asList(s1));
 * return (int)Arrays.stream(s2).filter(set::contains).count();
 * 
 * 답변 - 왜 이 기능들을 사용했는가:
 * 
 * 1. HashSet 사용 이유:
 *    - 중복 제거: s1에 같은 문자열이 여러 번 있어도 하나만 저장
 *    - 빠른 검색: contains() 메서드가 O(1) 시간복잡도로 매우 빠름
 *    - 기존 이중반복문 O(n×m) → O(n+m)으로 성능 대폭 개선
 * 
 * 2. Stream API 사용 이유:
 *    - 함수형 프로그래밍으로 코드 가독성 향상
 *    - filter()로 조건에 맞는 요소만 선별적으로 처리
 *    - 메서드 참조(set::contains)로 간결한 코드 작성
 * 
 * 3. Arrays.asList() 사용 이유:
 *    - 배열을 Collection으로 변환하여 HashSet 생성자에 전달
 *    - 배열의 모든 요소를 한 번에 HashSet에 추가
 * 
 * 4. count() 사용 이유:
 *    - 필터링된 결과의 개수를 효율적으로 계산
 *    - 별도의 카운터 변수 없이 스트림에서 직접 개수 반환
 */