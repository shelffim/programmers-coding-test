class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        answer.append(my_string);
        for(int[] query: queries) {
            String start = answer.substring(0,query[0]);
            mid.append(answer.substring(query[0],query[1] + 1));
            String last = answer.substring(query[1] + 1);
            answer.setLength(0);
            answer.append(start);
            answer.append(mid.reverse());
            answer.append(last);
            mid.setLength(0);
        }
        return answer.toString();
    }
}

// class Solution {
//     public String solution(String my_string, int[][] queries) {
//         StringBuilder answer = new StringBuilder(my_string);
        
//         for(int[] query: queries) {
//             int start = query[0];
//             int end = query[1];
            
//             // 해당 구간을 뒤집기
//             StringBuilder temp = new StringBuilder(answer.substring(start, end + 1));
//             temp.reverse();
            
//             // 원래 위치에 뒤집힌 문자열로 교체
//             answer.replace(start, end + 1, temp.toString());
//         }
        
//         return answer.toString();
//     }
// }