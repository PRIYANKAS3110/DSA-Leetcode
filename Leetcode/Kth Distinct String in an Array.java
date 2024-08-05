package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        List<String> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int j;
            for(j = 0; j < n; j++) {
                if(i != j && arr[i].equals(arr[j])) {
                    break;
                }
            }
            if(j == n) {
                l.add(arr[i]);
            }
        }
        return (k <= l.size()) ? l.get(k - 1) : "";
    }
}