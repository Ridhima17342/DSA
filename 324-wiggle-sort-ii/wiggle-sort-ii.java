class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        int n = nums.length-1;
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i+=2){
            nums[i] = arr[n--];
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i] = arr[n--];
        }
    }
}