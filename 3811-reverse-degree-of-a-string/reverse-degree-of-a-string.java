class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int idx = i+1;
            int rev = 'z'-s.charAt(i)+1;
            sum+=(rev*idx);
        }
        return sum;
    }
}