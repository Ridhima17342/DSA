class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while(read<chars.length){
            char curr = chars[read];
            int count = 0;
            // count duplicate characters
            while(read<chars.length && curr == chars[read]){
                read++;
                count++;
            }
            // write to the array
            chars[write] = curr;
            write++;
            // insert in the array
            if(count>1){
                String str = String.valueOf(count);
                for(char digit: str.toCharArray()){
                    chars[write] = digit;
                    write++;
                }
            }
        }
        return write;
    }
}