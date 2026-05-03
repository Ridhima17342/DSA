class Solution {
    private char[] rotate(char[]arr){
        char first = arr[0]; 
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            ch = rotate(ch);
            if(new String(ch).equals(goal)){
                return true;
            }
        }
        return false;
    }
}