class Solution {
    public boolean compareFreq(int[]arr1,int[]arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        // s1 ka table
        int [] count1 = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            count1[ch-'a']++;
        }
        //s2 window length count table
        // int i = 0;
        int [] count2 = new int[26];
        int window = s1.length();
        for(int i=0;i<window;i++){
            char ch = s2.charAt(i);
            count2[ch-'a']++;
        }
        // compare window
        if(compareFreq(count1,count2)==true){
            return true;
        }
        else{
            // increase the window size and check
            // process remaining window
            int i = window;
            while(i<s2.length()){
                // add new char to window
                char newchar = s2.charAt(i);
                int newidx = newchar -'a';
                count2[newidx]++;

                // remove old char from window
                int oldidx = i- window;
                char old = s2.charAt(oldidx);
                count2[old-'a']--;

                // check again
                if(compareFreq(count1,count2)==true){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}