class Solution {
    public int minMoves2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int median = 0;
        if(nums.length % 2 == 0) {
			median = (nums[nums.length/2-1] + nums[nums.length/2]) /2;
		}else {
			median = nums[nums.length/2];
		}
        for(int i=0;i<nums.length;i++){
            int diff = Math.abs(nums[i]-median);
            count += diff;
        }
        return count;
    }
}