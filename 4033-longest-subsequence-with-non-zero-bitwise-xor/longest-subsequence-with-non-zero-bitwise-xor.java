class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean f = true;
        for(int i =0;i<n;i++){
            res ^= nums[i];
            if(nums[i]!=0){
                f = false;
        }
        }
        if(f) return 0;
        if(res!=0) return n;
        return n-1;
    }
}