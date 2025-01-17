package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j])  {
                    min=matrix[i][j];   
                    col = j;   
                } 
            }

            boolean isTrue = true;

            for(int j=0;j<matrix.length;j++){
                if(matrix[i][col]<matrix[j][col]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                list.add(matrix[i][col]);
            } 
                
        }
        return list;
    }
}
