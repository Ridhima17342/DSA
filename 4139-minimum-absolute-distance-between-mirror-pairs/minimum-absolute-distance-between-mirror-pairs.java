class Solution {
    public int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j])) {
                int i = map.get(nums[j]);
                min = Math.min(min, j - i);
            }
            int rev = reverse(nums[j]);
            map.put(rev, j);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}