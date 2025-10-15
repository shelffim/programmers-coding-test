import java.util.TreeMap;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                map.put(rank[i], i);
            }
        }
        int[] answer = new int[3];
        int idx = 0;
        for(Integer key: map.keySet()) {
            if (idx >= 3) {
                break;
            }
            answer[idx++] = map.get(key);
        }
        return 10000 * answer[0] + 100 * answer[1] + answer[2];
    }
}

/*
TreeMap에서 바로 값을 꺼내서 학생 번호를 가져오는 다양한 방법들:

1. 현재 코드 (올바른 방법)
   for(Integer key: map.keySet()) {
       answer[idx++] = map.get(key);
   }

2. Iterator 사용
   Iterator<Integer> iterator = map.keySet().iterator();
   for(int i = 0; i < 3; i++) {
       if(iterator.hasNext()) {
           answer[i] = map.get(iterator.next());
       }
   }

3. EntrySet 사용
   int idx = 0;
   for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
       if(idx >= 3) break;
       answer[idx++] = entry.getValue();
   }

4. Stream 사용 (Java 8+)
   int[] selectedStudents = map.entrySet().stream()
       .limit(3)
       .mapToInt(Map.Entry::getValue)
       .toArray();

5. 가장 간결한 방법 - firstKey() 사용
   int a = map.get(map.firstKey());
   int b = map.get(map.higherKey(map.firstKey()));
   int c = map.get(map.higherKey(map.higherKey(map.firstKey())));
   return 10000 * a + 100 * b + c;

TreeMap 메서드 설명:
- firstKey(): 가장 작은 키(1등)를 반환
- higherKey(key): 주어진 키보다 큰 키 중 가장 작은 키를 반환
- get(key): 키에 해당하는 값(학생 번호)을 반환
*/