class Solution {
    public void solve(int[] arr,int n,int k,int index, int count,List<Integer> output,List<List<Integer>> ans){
        if(count>k){
            return;
        }
        if(count == k && n==0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index >= arr.length){
            return;
        }
        if(n<0){
            return;
        }
        //include 
        output.add(arr[index]);
        solve(arr,n-arr[index],k,index+1,count+1,output,ans);
        output.remove(output.size()-1);

        //exclude
        solve(arr,n,k,index+1,count,output,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        solve(arr,n,k,index,count,output,ans);
        return ans;
    }
}