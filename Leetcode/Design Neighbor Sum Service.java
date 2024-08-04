package Leetcode;

import java.util.HashMap;
import java.util.Map;

class neighborSum {
    private int[][] grid;
    private int n;
    private Map<Integer, int[]> valueToPos;

    public neighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.valueToPos = new HashMap<>();
        
     
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                valueToPos.put(grid[r][c], new int[]{r, c});
            }
        }
    }
    
    public int adjacentSum(int value) {
        if (!valueToPos.containsKey(value)) {
            return 0;
        }
        
        int[] pos = valueToPos.get(value);
        int r = pos[0], c = pos[1];
        int adjacentSum = 0;
        
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                adjacentSum += grid[nr][nc];
            }
        }
        
        return adjacentSum;
    }
    
    public int diagonalSum(int value) {
        if (!valueToPos.containsKey(value)) {
            return 0;
        }
        
        int[] pos = valueToPos.get(value);
        int r = pos[0], c = pos[1];
        int diagonalSum = 0;
        
        
        int[][] directions = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        
        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                diagonalSum += grid[nr][nc];
            }
        }
        
        return diagonalSum;
    }
}



