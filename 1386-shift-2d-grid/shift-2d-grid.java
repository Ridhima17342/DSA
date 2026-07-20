class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans.add(grid[i][j]);
            }
        }
        k = k % (ans.size());
        Collections.reverse(ans);
        for(int i=0;i<k;i++){
            int ele = ans.get(0);
            ans.add(ele);
            ans.remove(0);
        }
        Collections.reverse(ans);
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<grid.length;i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0;j<grid[0].length;j++){
                row.add(ans.get(0));
                ans.remove(0);
            }
            res.add(row);
        }
        return res;
    }
}