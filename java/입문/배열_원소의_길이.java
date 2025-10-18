class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

/*
 * Stream API를 사용한 다른 해결 방법들:
 * 
 * 1. mapToInt() 사용 (권장)
 * return Arrays.stream(strlist)
 *         .mapToInt(String::length)  // IntStream 반환
 *         .toArray();               // int[] 반환
 * 
 * 2. map() 사용 시 문제점
 * Stream<Integer> stream = Arrays.stream(strlist)
 *         .map(String::length);     // Stream<Integer> 반환
 * 
 * Object[] objArray = stream.toArray();  // Object[] 반환! (int[] 아님)
 * 
 * map vs mapToInt 차이점:
 * - map(): Stream<T> 반환 (객체 타입)
 * - mapToInt(): IntStream 반환 (primitive int 타입)
 * 
 * Stream<Integer>.toArray()는 Object[] 배열을 반환한다!
 * int[] 배열이 필요하다면 mapToInt()를 사용해야 함.
 */