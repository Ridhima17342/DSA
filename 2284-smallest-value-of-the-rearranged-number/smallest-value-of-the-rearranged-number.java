class Solution {
    private long positive(long num){
        char[] ch = Long.toString(num).toCharArray();
        Arrays.sort(ch);
        // for phele zero
        int i = 0;
        while(i<ch.length && ch[i] == '0'){
            i++;
        }
        if (i < ch.length) {
            char temp = ch[0];
            ch[0] = ch[i];
            ch[i] = temp;
        }
        return Long.parseLong(new String(ch));
    }
    private long negative(long num){
        char[] ch = Long.toString(num).toCharArray();
        Arrays.sort(ch);
         // reverse for descending order
        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return Long.parseLong(new String(ch));
    }

    public long smallestNumber(long num) {
        if(num < 0){
            return -negative(-num);
        }
        else{
            return positive(num);
        }
    }
}