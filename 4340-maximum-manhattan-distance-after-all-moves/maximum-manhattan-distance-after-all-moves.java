class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int count = 0;
        for(int i =0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                y++;
            }
            else if(ch == 'D'){
                y--;
            }
            else if(ch == 'L'){
                x--;
            }
            else if(ch == 'R'){
                x++;
            }else{
                count++;
            }
        }
        int dist = Math.abs(x)+Math.abs(y);
        return dist+count;
    }
}