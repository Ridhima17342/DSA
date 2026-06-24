class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(s==e){
                return nums[s];
            }
            int curr = nums[mid];

            int prev = -1;
            if(mid-1>=0){
                prev = nums[mid-1];
            }
            int next = -1; 
            if(mid+1<n){
                next = nums[mid+1];
            }
            if(curr != prev && curr != next){
                return curr;              // yeh hai ans 
            }
            if(curr != prev && curr == next){   // agar right wale se equal hai or left wale se nhi
                int stindex = mid;
                if(stindex % 2 != 0){
                    e = mid-1; //odd-even pair -> move to left
                }else{
                    s = mid+1; //even-odd pair -> move to right
                    
                }
            }
            else if(curr == prev && curr != next){   // agar left wale se equal hai or right wale se nhi
                int endindex = mid;
                if(endindex % 2 != 0){
                    s = mid+1; //even-odd pair -> move to right
                }else{
                    e = mid-1; //odd-even pair -> move to left
                }
            }
            
        }
        return -1;
    }
}