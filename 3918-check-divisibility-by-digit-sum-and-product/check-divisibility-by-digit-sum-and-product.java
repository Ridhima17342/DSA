class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int dup = n;
        while(n>0){
            int temp = n%10;
            sum+=temp;
            prod*=temp;
            n=n/10;
        }
        int res = sum+prod;
        if(dup % res == 0){
            return true;
        }
        return false;
    }
}