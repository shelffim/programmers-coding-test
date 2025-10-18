class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}

// StringBuffer은 문자열 배열이나 문자열만 가능
// Collections.reverse()는 List 인터페이스를 구현한 객체만 받는다.