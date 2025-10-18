class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] arr = new String[j - i + 1];
        
        // 배열 만들기
        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = String.valueOf(i++);
        }
        
        for(String s: arr) {
            for(char c: s.toCharArray()) {
                if(k == Character.getNumericValue(c)) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}