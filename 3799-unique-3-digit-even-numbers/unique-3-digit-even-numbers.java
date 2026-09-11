class Solution {
    public void solve(int[] digits,int index,List<Integer> ans,int num,boolean[] used){
        if(index == 3){
            if(num % 2 == 0){
                ans.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]){
                continue;
            }
            if(index == 0 && digits[i] == 0){
                continue;
            }
            if (i > 0 && digits[i] == digits[i - 1] && !used[i - 1]) {
                continue;
            }
            // if(index == 2 && digits[i]%2 != 0){
            //     continue;
            // }
            used[i] = true;

            solve(digits,index+1,ans,num*10+digits[i],used);

            used[i] = false;
        }
    }
    public int totalNumbers(int[] digits) {
        Arrays.sort(digits);
        int index = 0;
        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[digits.length];
        int num = 0;
        solve(digits,index,ans,num,used);
        return ans.size();
    }
}