import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap();
        for(String str: strArr) {
            map.merge(str.length(), 1, (ov, nv) -> ov + 1);
        }
        
        return map.isEmpty() ? 0 : Collections.max(map.values());
    }
}