import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] arr = {a,b,c,d};
        for(int i: arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                continue;
            }
            
            map.put(i,1);
        }
        int size = map.size();
        switch(size) {
            case 4:
                return map.firstKey();
            case 1:
                return map.firstKey() * 1111;
            case 2:
                int fk = map.firstKey();
                int lk = map.lastKey();
                if (map.get(fk) == 2) {
                    return (fk + lk) * Math.abs(fk - lk);
                } else if (map.get(fk) == 3) {
                    return (int) Math.pow((10 * fk + lk), 2);
                } else {
                    return (int) Math.pow((10 * lk + fk), 2);
                }
            case 3:
                for(int key: map.keySet()) {
                    if (map.get(key) == 2) {
                        map.remove(key);
                        return map.firstKey() * map.lastKey();
                    }
                }
        }
        return 0; // 기본 반환값 추가
    }
}