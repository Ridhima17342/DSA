class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        long[] sq = new long[n];

        for (int i = 0; i < n; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);
        for(int i=0;i<nums.length;i++){
            if(i<n/2){
                sum -= sq[i];
            }else{
                sum += sq[i];
            }
        }
        return sum;
    }
}