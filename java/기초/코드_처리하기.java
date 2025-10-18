class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        for(int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                mode = trigger(mode);
                continue;
            }
            if (mode == 0 && isEven(idx)) {
                ret.append(code.charAt(idx));
            }
            if (mode == 1 && !isEven(idx)) {
                ret.append(code.charAt(idx));
            }
        }
        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
    
    public int trigger(int mode) {
        if (mode == 1) {
            return 0;
        }
        
        return 1;
    }
                
    public boolean isEven(int idx) {
        return idx % 2 == 0;
    }
}