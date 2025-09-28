import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length;) {
            if (list.size() == 0) {
                list.add(arr[i++]);
            } else {
                int lastIdx = list.size() - 1;
                if (list.get(lastIdx) < arr[i]) {
                    list.add(arr[i++]);
                } else {
                    list.remove(lastIdx);
                }
            }
        }
        int[] stk = new int[list.size()];
        for(int i = 0; i < stk.length; i++) {
            stk[i] = list.get(i);
        }
        return stk;
    }
}

// 스택으로 풀어보기