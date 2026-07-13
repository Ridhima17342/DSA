class Solution {
    public void generate(int low,int high,long curr,List<Integer> res){
        if(curr>high){
            return;
        }
        if(curr>=low){
            res.add((int)curr);
        }
        long n = curr % 10;
        if(n<9){
            long next2 = curr*10+(n+1);
            generate(low,high,next2,res);
        }
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            generate(low,high,i,ans);
        }
        Collections.sort(ans);
        return ans;
    }
}