class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder yc = new StringBuilder(); 
        StringBuilder xc = new StringBuilder(); 
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == x){
                xc.append(s.charAt(i));
            }
            else if(s.charAt(i) == y){
                yc.append(s.charAt(i));
            }else{
                sb.append(s.charAt(i));
            }
        }
        String ans = yc.toString()+sb.toString()+xc.toString();
        return ans;
    }
}