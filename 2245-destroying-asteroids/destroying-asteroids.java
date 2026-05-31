class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass = m;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=mass){
                mass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}