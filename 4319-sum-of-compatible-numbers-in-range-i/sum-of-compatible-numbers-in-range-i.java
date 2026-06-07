class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int ans = 0;
        int x = Math.max(1, n - k);
        for (int i = x; i <= n + k; i++) {
            if ((n & i) == 0) {
                ans += i;
            }
        }
        return ans;
    }
}