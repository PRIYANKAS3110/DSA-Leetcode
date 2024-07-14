package Leetcode;

class Solution {
    public String getSmallestString(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        
        for (int i = 0; i < n - 1; i++) {
            if ((a[i]) % 2 == (a[i + 1]) % 2) { 
                if (a[i] > a[i + 1]) { 
                    char temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    break; 
                }
            }
        }
        
        return new String(a);
    }
}

