class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] arr = new int[size];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = grid[i][j];
            }
        }

        int duplicate = -1;
        for(int i=0;i<arr.length;i++){
            int value = Math.abs(arr[i]);
            int pos = value -1;
            
            if(arr[pos]<0){
                duplicate = value;
            }
            else{
                arr[pos] = -arr[pos];
            }
        }
        int missing = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                missing = i+1;
                break;
            }
        }
        return new int[] {duplicate,missing};
    }
}