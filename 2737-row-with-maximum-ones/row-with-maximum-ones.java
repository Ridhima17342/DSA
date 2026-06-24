class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int max = 0;
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max = count;
                idx = i;
            }
        }
        return new int[]{idx,max};
    }
}