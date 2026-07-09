class Solution {
    public int maxDigitRange(int[] nums) {
        int[] range = nums.clone();
        int maxrange = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            int min = 9;
            int n = range[i];
            while (n != 0) {
                int r = n % 10;
                max = Math.max(r, max);
                min = Math.min(r, min);
                n = n / 10;
            }
            range[i] = max - min;
            maxrange = Math.max(maxrange,range[i]);
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(range[i] == maxrange){
                ans += nums[i];
            }
        }
        return ans;
    }
}