class Solution {
    public void generate(String str, int len, List<String> res){
        if(str.length()==len){
            res.add(str);
            return;
        }
        if(str.isEmpty() || str.charAt(str.length()-1)=='1'){
            generate(str + "0", len, res);
        }
        generate(str + "1", len, res);
    }
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        int len = n;
        generate("",n,res);
        return res;
    }
}