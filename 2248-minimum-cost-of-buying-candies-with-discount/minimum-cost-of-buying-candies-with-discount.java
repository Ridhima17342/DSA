class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int min = 0;
        if(cost.length==1){
            return cost[0];
        }
        if(cost.length==2){
            return cost[0]+cost[1];
        }
        for(int i = cost.length-1;i>=0;i-=3){
            min += cost[i];
            if (i - 1 >= 0) {
                min += cost[i - 1]; 
            }
        }
        return min;
    }
}