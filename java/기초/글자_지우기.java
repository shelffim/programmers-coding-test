class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int i: indices) {
            answer.replace(i, i + 1, " ");
        }
        
        return answer.toString().replaceAll("[\\s]", "");
    }
}