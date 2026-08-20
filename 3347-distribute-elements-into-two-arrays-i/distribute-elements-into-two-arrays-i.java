class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<n;i++){
            int x = arr1.size();
            int y = arr2.size();
            if(arr1.get(x-1)>arr2.get(y-1)){
                arr1.add(nums[i]);
            }
            else {
                arr2.add(nums[i]);
            }
        }
        int j = 0;
        for(int i:arr1){
            res[j++] = i;
        }
        for(int i:arr2){
            res[j++] = i;
        }
        return res;
    }
}