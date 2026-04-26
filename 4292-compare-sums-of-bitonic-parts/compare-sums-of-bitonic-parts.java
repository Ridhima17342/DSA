class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int peak = 0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                peak = i;
            }else{
                break;
            }
        }
        long ascsum = 0;
        long descsum = 0;
        for(int i=0;i<=peak;i++){
            ascsum+=nums[i];
        }
        for(int i=peak;i<n;i++){
            descsum+=nums[i];
        }
        if(ascsum>descsum) return 0;
        if(ascsum<descsum) return 1;
        return -1;
    }
}