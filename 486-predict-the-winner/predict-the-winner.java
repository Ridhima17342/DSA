class Solution {
    public int solve(int[]nums, int l,int r){
        if(l == r){
            return nums[l]; 
        }
        int play1 = nums[l]-solve(nums,l+1,r);
        int play2 = nums[r]-solve(nums,l,r-1);

        return Math.max(play1,play2);
    }
    public boolean predictTheWinner(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int ans = solve(nums,l,r);
        if(ans>=0){
            return true;
        }
        return false;
    }
}