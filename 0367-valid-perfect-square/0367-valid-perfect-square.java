class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        
        int l = 1;
        int r = num;
        while(l <= r){
            int m = l + (r-l)/2;
            int result = num/m;
            int remain = num % m;
            if(result == m && remain == 0){
                return true;
            } 
            if(result > m) {l = m + 1;}
            else {r = m - 1;}
        }

        return false;
    }
}