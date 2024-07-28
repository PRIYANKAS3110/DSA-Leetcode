package Leetcode;

class Solution {
    public boolean canAliceWin(int[] nums) {
        int l=0;
        int s=0;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]%10==nums[i]){
                l+=nums[i];
            
            }
            else{
                s+=nums[i];
            }
        }
        if(l>s || s>l){
            return true;
        }
        return false;
    }
}