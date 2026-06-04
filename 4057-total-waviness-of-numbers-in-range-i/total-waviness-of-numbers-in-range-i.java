class Solution {
    public int check(int n){
        String s = String.valueOf(n);
        int len = s.length();
        if(len<3) return 0;
        int count = 0;
        for(int i=1;i<len-1;i++){
            int prev = s.charAt(i-1)-'0';
            int curr = s.charAt(i)-'0';
            int next = s.charAt(i+1)-'0';
            if(prev<curr && curr>next) count++;
            else if(prev>curr && curr<next) count++;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int wave = 0;
        for(int i=num1;i<=num2;i++){
            wave += check(i);
        }
        return wave;
    }
}