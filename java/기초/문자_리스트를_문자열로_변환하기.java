class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(String s: arr) {
            answer.append(s);
        }
        return String.valueOf(answer);
    }
}

//String.join("", arr);