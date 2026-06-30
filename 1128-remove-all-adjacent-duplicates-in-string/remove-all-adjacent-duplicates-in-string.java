class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans.isEmpty()){
                ans.append(ch);
            }
            else if(ans.length()>0 && ans.charAt(ans.length()-1)== ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else if(ans.charAt(ans.length()-1) != ch){
                ans.append(ch);
            }
        } 
        return ans.toString();
    }
}