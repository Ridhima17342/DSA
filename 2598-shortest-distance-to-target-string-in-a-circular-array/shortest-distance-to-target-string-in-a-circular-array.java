class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int res = Integer.MAX_VALUE;
        int n = words.length;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int diff = Math.abs(i - startIndex);
                int dis = Math.min(diff, n - diff);
                res = Math.min(dis, res);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}