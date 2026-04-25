class Solution {
    public boolean validDigit(int n, int x) {
        String str = String.valueOf(n);
        char c = (char) (x+'0');
        if(str.charAt(0)==c){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}