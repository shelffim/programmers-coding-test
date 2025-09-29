class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if (is_suffix.equals(my_string.substring(i))) {
                return 1;
            }
        }
        return answer;
    }
}

// endsWith() 메서드 사용