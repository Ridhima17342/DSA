class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int st = x;
        int end = x+k-1;
        while(st<end){
            for(int i=y;i<y+k;i++){
                int temp = grid[st][i];
                grid[st][i] = grid[end][i];
                grid[end][i] = temp;
            }
            st++;
            end--;
        }
        return grid;
    }
}