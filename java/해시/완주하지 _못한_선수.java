import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> players = new HashMap<>();

        // 참가자 추가 (동명이인 수 계산)
        for (String player: participant) {
            players.put(player, players.getOrDefault(player, 0) + 1);
        }

        // 완주자 카운트 제거
        for (String finish_player: completion) {
            players.put(finish_player, players.get(finish_player) - 1);
        }

        // 카운트가 0이 아니면 도착하지 못한 사람
        for (String name: players.keySet()) {
            if (players.get(name) != 0) {
                return name;
            }
        }

        return "";
        
    }

    
}