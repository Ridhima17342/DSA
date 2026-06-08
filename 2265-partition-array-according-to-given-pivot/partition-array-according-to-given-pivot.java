class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] res = new int[nums.length];
        int less = 0;
        int equal = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less++;
            }
            else if(nums[i]==pivot) equal++;
        }
        int idx1=0;
        int idx2=less;
        int idx3=less+equal;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) {
                res[idx1++]=nums[i];
            }
            else if(nums[i]==pivot){
                res[idx2++]=nums[i];
            }
            else{
                res[idx3++]=nums[i];
            }
        }
        return res;
    }
}