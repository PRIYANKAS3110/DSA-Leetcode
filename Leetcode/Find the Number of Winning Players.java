package Leetcode;

 
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        
        Map<Integer, Map<Integer, Integer>> cloudCount = new HashMap<>();
        
        for (int[] sky : pick) {
            int star = sky[0];
            int moon = sky[1];
            
            cloudCount.putIfAbsent(star, new HashMap<>());
            Map<Integer, Integer> moonCount = cloudCount.get(star);
            moonCount.put(moon, moonCount.getOrDefault(moon, 0) + 1);
        }
        
        int winners = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : cloudCount.entrySet()) {
            int star = entry.getKey();
            Map<Integer, Integer> moons = entry.getValue();
            for (int count : moons.values()) {
                if (count > star) {
                    winners++;
                    break;  
                }
            }
        }
        
        return winners;
    }
}
