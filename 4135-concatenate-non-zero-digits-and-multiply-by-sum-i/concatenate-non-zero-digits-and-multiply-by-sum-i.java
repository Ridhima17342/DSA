class Solution {
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public long sumAndMultiply(int n) {
        String s = "";
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                s+=str.charAt(i);
            }
        }
        if(s.length() == 0) return 0;
        int x = Integer.parseInt(s);
        return (long)x*sum(x);
    }
}