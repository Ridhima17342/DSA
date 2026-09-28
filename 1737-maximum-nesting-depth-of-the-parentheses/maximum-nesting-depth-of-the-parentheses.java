class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxi = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(ch);
                maxi = Math.max(maxi,st.size());
            }
            if(!st.isEmpty() && ch == ')'){
                st.pop();
            }
        }
        return maxi;
    }
}