class Solution {
    public int solve(int idx,int l,int[]nums,int[]multipliers,int[][] dp){
        if(idx == multipliers.length){
            return 0;
        }
        if(dp[idx][l] != 0){
            return dp[idx][l];
        }
        int n = nums.length;
        int left = nums[l]*multipliers[idx] + solve(idx+1,l+1,nums,multipliers,dp);
        int right = nums[n-1-(idx-l)]*multipliers[idx] + solve(idx+1,l,nums,multipliers,dp);
        return dp[idx][l] = Math.max(left,right);
    }
    public int maximumScore(int[] nums, int[] multipliers) {
        int l = 0;
        int m = multipliers.length;
        int [][] dp = new int[m][m];
        return solve(0,l,nums,multipliers,dp);
    }
}