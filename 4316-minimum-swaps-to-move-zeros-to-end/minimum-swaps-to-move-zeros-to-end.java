class Solution {
    public int minimumSwaps(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while(left<=right){
            if(nums[right]==0){
                right--;
                continue;
            }
            if(nums[left]==0){
                nums[left] = nums[right];
                nums[right] = 0;
                right--;
                count++;
            }
            left++;
        }
        return count;
    }
}