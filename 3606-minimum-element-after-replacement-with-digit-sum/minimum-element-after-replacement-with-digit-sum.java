class Solution {
    public int minElement(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int sum = 0;
            while(n!=0){
                int rem = n%10;
                sum += rem;
                n=n/10;
                ans[i] = sum;
            }
        }
        Arrays.sort(ans);
        return ans[0];
    }
}