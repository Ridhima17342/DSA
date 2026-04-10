class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int dist = Integer.MAX_VALUE;
        int abs = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if (nums[i] == nums[j] && nums[j] == nums[k]){
                        abs = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        dist = Math.min(dist,abs);
                    }
                }
            }
        }
        return dist == Integer.MAX_VALUE ? -1 : dist;
    }
}