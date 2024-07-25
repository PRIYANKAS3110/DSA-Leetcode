package Leetcode;

class Solution {
    Integer[][] memo;
    public int twoEggDrop(int n) {
        memo=new Integer[n+1][3];
        return f(n,2);
    }
    public int f(int n, int e){
        if(n==0 || n==1){
            return n;
        }
        if(e==1){
            return n;
        }
        if(memo[n][e]!=null){
            return memo[n][e];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1; i<=n ; i++){
            int willBreak=f(i-1,e-1);
            int notBreak=f(n-i,e);
            ans=Math.min(ans,Math.max(willBreak,notBreak));
        }
        return memo[n][e]=ans+1;
    }
}
