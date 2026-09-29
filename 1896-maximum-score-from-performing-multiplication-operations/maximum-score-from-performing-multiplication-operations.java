class Solution {
    public int solve(int idx,int l,int[]nums,int[]multipliers,int[][] dp){
        int n = nums.length;
        int m = multipliers.length;
        for(int i=m-1;i>=0;i--){
            for(int j = i;j>=0;j--){
                int left = nums[j]*multipliers[i]+dp[i+1][j+1];
                int r = n-1-(i-j);
                int right = nums[r]*multipliers[i]+dp[i+1][j];

                dp[i][j] = Math.max(left,right);
            }

        }
        return dp[0][0];
    }
    public int maximumScore(int[] nums, int[] multipliers) {
        int l = 0;
        int m = multipliers.length;
        int [][] dp = new int[m+1][m+1];
        return solve(0,l,nums,multipliers,dp);
    }
}