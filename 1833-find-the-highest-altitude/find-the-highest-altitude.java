class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int[] ans = new int[n+1];
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            ans[i+1] = ans[i] + gain[i];
        }
        Arrays.sort(ans);
        return ans[n];
    }
}