class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int count = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                l++;
            }
            else if(moves.charAt(i)=='R'){
                r++;
            }
            else{
                count++;
            }
        }
        return Math.abs(l-r)+count;
    }
}