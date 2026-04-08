class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        for(int[] q: queries){
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];
            int idx = l;
            while(idx <= r){
                nums[idx] = (int)((1L*nums[idx]*v) % mod);
                idx += k;
            }
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}