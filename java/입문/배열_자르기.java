class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int idx = num1, i = 0; idx <= num2; idx++, i++) {
            answer[i] = numbers[idx];
        }
        return answer;
    }
}

/*
 * 질문:  Arrays.copyOfRange(numbers, num1, num2 + 1) 구문 분석해줘
 * 답변: Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스)
 *       - num1부터 num2+1 전까지 복사 (즉, num1~num2)
 *       - 끝인덱스는 불포함이므로 num2+1을 사용
 *       - 1줄로 간결하게 해결 가능
 * 
 * 질문: IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray() 구문 분석해줘
 * 답변: IntStream 방식 (함수형 프로그래밍)
 *       - rangeClosed(num1, num2): num1~num2 인덱스 스트림 생성
 *       - map(i -> numbers[i]): 인덱스를 배열 값으로 변환
 *       - toArray(): 스트림을 배열로 변환
 *       - 선언적이고 현대적이지만 성능 오버헤드 있음
 */