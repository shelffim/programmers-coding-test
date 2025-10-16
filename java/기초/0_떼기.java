class Solution {
    public String solution(String n_str) {
        int not_zero_idx = 0;
        for(; not_zero_idx < n_str.length(); not_zero_idx++) {
            if (n_str.charAt(not_zero_idx) != '0') {
                break;
            }
        }
        return n_str.substring(not_zero_idx);
    }
}