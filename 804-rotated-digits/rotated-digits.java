class Solution {
    static ArrayList<Integer> arr = new ArrayList<>();

    private boolean isvalid(int n) {
        boolean valid = false;
        while (n > 0) {
            int temp = n % 10;
            if (temp == 3 || temp == 4 || temp == 7) {
                return false;
            }
            if (temp == 2 || temp == 5 || temp == 6 || temp == 9) {
                valid = true;
            }
            n /= 10;
        }
        return valid;
    }

    public int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isvalid(i)) {
                count++;
            }
        }

        return count;
    }
}