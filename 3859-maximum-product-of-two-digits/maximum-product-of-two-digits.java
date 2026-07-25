class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        int x = arr.length;
        Arrays.sort(arr);
        return arr[x-1]*arr[x-2];
    }
}