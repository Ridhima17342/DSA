class Solution {
    public boolean isValid(int[] citations,int mid){
        int count = 0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=mid){
                count++;
            }
        }
        if(count >= mid){
            return true;
        }
        return false;
    }
    public int hIndex(int[] citations) {
        int st = 0;
        int max = 0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>max){
                max = citations[i];
            }
        }
        int end = max;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isValid(citations,mid)){
                ans = mid;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}