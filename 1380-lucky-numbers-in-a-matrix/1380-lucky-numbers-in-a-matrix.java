class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> maxCol = new ArrayList<>();
        List<Integer> minRow = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int minrow = matrix[i][0];
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < minrow){
                    minrow = matrix[i][j];
                }
                
            }
            minRow.add(minrow);
        }

        for(int j = 0; j < matrix[0].length; j++){
            int maxcol = matrix[0][j];
            for(int i = 1; i < matrix.length; i++){
                if(matrix[i][j] > maxcol){
                    maxcol = matrix[i][j];
                }
                
            }
            maxCol.add(maxcol);
        }

        List<Integer> lucky = new ArrayList<>(minRow);
        lucky.retainAll(maxCol);

        return lucky;
    }
}