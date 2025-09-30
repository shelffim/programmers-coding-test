class Solution {
    public String solution(String my_string, int m, int c) {
        char[] c_arr = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < c_arr.length; i++) {
            if (i % m == (c-1)) {
                answer.append(c_arr[i]);
            }
        }
        return answer.toString();
    }
}