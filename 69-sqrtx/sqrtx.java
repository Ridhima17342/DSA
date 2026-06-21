class Solution {
    public int mySqrt(int x) {
        int st = 1;
        int end = x;
        int ans = -1;
        if(x==0) return 0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid == x/mid){
                return mid;
            }
            if(mid > x/mid){
                end = mid-1;
            }
            if(mid < x/mid){
                ans = mid;
                st = mid+1;
            }
        }
        return ans;
    }
}