class Solution {
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        int ans = gcd(b,a%b);
        return ans;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return gcd(nums[0],nums[n-1]);
    }
}