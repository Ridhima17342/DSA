class Solution {
    public static int getpivot(int arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }
    public static int binarysearch(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1)
            return nums[0] == target ? 0:-1;
        int pivot = getpivot(nums);
        if(target >= nums[pivot] && target<= nums[nums.length-1]){
            return binarysearch(nums,pivot,nums.length-1,target);
        }else{
            return binarysearch(nums,0,pivot-1,target);
        }
    }
}