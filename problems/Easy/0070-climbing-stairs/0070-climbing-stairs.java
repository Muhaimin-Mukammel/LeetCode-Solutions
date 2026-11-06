class Solution {
    public int climbStairs(int n) {
        if( n == 1 || n == 0) return 1;
        int[] pocket = new int[n+1];
        pocket[0] = pocket[1] = 1;
        for(int i = 2; i <= n; i++){
            pocket[i] = pocket[i-1] + pocket[i-2];
        }

        return pocket[n];
    }
}