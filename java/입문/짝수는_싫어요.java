class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for(int i = 1, idx = 0; i <= n; i += 2, idx++) {
            answer[idx] = i;
        }
        return answer;
    }
}

// IntStream.iterate(1, i -> i <= n, i -> i + 2).toArray();
// 매개변수 설명:
// 1. seed (시작값): 1 - 스트림의 첫 번째 요소
// 2. hasNext (조건): i -> i <= n - 다음 요소가 존재하는지 판단하는 조건
// 3. next (다음값 생성): i -> i + 2 - 다음 요소를 생성하는 함수
// 
// 동작 과정:
// 1단계: i = 1, 1 <= n? true → 1 추가
// 2단계: i = 3, 3 <= n? true → 3 추가  
// 3단계: i = 5, 5 <= n? true → 5 추가
// ... 조건이 false가 될 때까지 반복
// 마지막: .toArray()로 int 배열로 변환