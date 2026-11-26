class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int currsum = 0;
        int cow = 0;
        int goat = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                if(cow > goat){
                    currsum = 0;
                    goat++;
                }
                currsum += accounts[i][j];
                if(currsum > max){
                    max = currsum;
                }
            }
            cow++;
        }

        return max;
    }
}