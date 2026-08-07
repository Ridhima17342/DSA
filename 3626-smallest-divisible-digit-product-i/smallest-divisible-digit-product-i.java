class Solution {
    public int prod(int n){
        int prod = 1;
        while(n != 0){
            int temp = n%10;
            prod*=temp;
            n=n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(prod(i)%t==0){
                return i;
            }
        }
        return 0;
    }
}