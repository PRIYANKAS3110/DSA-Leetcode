package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = 1000000007;
        ArrayList<Integer> subarraySums = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }

    
        Collections.sort(subarraySums);

        
        long result = 0;
        for (int k = left - 1; k < right; k++) {
            result = (result + subarraySums.get(k)) % MOD;
        }

        return (int) result;
    }
}
