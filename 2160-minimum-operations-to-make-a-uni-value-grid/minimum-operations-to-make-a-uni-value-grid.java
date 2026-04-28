class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[n*m];
        int idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int count = 0;
        int median = arr[(arr.length)/2];
        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(arr[i]-median);
            if(diff % x != 0){
                return -1;
            }else{
                count += diff/x;
            }
        }
        return count;
    }
}