class Solution {
    public void solve(String digits,String[]map,StringBuilder output,List<String> ans,int index){
        if(index >= digits.length()){
            ans.add(output.toString());
            return;
        }
        // find the numerical value of the string
        int val = digits.charAt(index)-'0';
        //link the no to the map string array
        String str = map[val];
        for(int i=0;i<str.length();i++){
            // add the letter in the string
            output.append(str.charAt(i));
            solve(digits,map,output,ans,index+1);

            // backtrack and remove the letter 
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder output = new StringBuilder();
        List<String> ans = new ArrayList<>();
        int index = 0;
        solve(digits,map,output,ans,index);
        return ans;
    }
}