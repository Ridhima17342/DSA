class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            if(buy<prices[i]){
                int sp = prices[i];
                int profit = sp-buy;
                if(i==prices.length-1 || prices[i]>prices[i+1]){
                    max += profit;
                    buy = Integer.MAX_VALUE;
                }
            }
        }
        return max;
    }
}