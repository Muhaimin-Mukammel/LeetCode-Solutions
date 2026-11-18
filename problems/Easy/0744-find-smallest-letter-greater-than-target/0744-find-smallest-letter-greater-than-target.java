class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lp = 0;
        int rp = letters.length - 1;

        while(lp <= rp){
            int m = lp + (rp-lp)/2;

            if(letters[m] > target){
                rp = m - 1;
            } else{
                lp = m + 1;
            }
        }



        return letters[lp % letters.length]; // what the hell is this?
    }
}