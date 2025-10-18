import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

/*
 * Stream 방식 구현:
 * return Arrays.stream(num_list).sorted().skip(5).toArray();
 * 
 * === 동작 과정 ===
 * 1. Arrays.stream(numList)
 *    - 배열을 IntStream으로 변환
 *    - 원본 배열은 변경되지 않음
 * 
 * 2. .sorted()
 *    - 스트림 요소들을 오름차순 정렬
 *    - 예: [12, 4, 15, 46, 38, 1, 14] → [1, 4, 12, 14, 15, 38, 46]
 * 
 * 3. .skip(5)
 *    - 정렬된 스트림에서 처음 5개 요소를 건너뜀
 *    - 예: [1, 4, 12, 14, 15, 38, 46] → [38, 46]
 *    - 작은 값 5개를 제외하여 큰 값들만 남김
 * 
 * 4. .toArray()
 *    - 스트림을 int[] 배열로 변환
 *    - 최종 연산으로, 이 시점에 모든 연산이 실행됨
 * 
 * === 현재 방식과 비교 ===
 * 현재 방식:
 *   - Arrays.sort(num_list): 원본 배열을 직접 수정
 *   - Arrays.copyOfRange(): 배열의 일부를 복사
 * 
 * Stream 방식:
 *   - 원본 배열 보존 (불변성)
 *   - 더 함수형이고 선언적인 코드
 *   - 약간의 성능 오버헤드 존재 (Stream 생성 비용)
 * 
 * 두 방식 모두 유효하며, 원본 보존이 필요하면 Stream 방식,
 * 성능이 중요하면 현재 방식이 더 적합함
 */