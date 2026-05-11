class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(n<=9){
                ans.add(n);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (n != 0) {
                    int rem = n % 10;
                    temp.add(rem);
                    n = n / 10;
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    ans.add(temp.get(j));
                }
            }
        }
        int arr[] = new int[ans.size()];
        for(int i =0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}