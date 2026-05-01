class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int f0 = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            f0 += i*nums[i];
        }
        int max = f0;
        int fk = f0;
        for(int i=1;i<nums.length;i++){
            fk = fk + sum - nums.length * nums[nums.length-i];
            max = Math.max(fk,max);
        }
        return max;
    }
}