class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int cow = 0;
        int goat = mat[0].length - 1;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(j == cow && j == goat){
                    sum += mat[i][j];
                } else if(j == cow){
                    sum += mat[i][j];
                } else if(j == goat){
                    sum += mat[i][j];
                }
            }
            cow++;
            goat--;
        }
        return sum;
    }
}