class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int wind = 0;
        for(int i=0;i<k;i++){
            wind += arr[i];
        }
        if(wind/k >= threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            wind += arr[i]-arr[i-k];
            if(wind/k>=threshold) count++;
        }
        return count;
    }
}