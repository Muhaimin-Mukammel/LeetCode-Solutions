class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];

        if(startColor != color){
            dfs(image, sr, sc, startColor, color);
        }

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int startColor, int color){
        if(sr < 0 || sr >= image.length || sc<0 || sc >=image[0].length || image[sr][sc] != startColor){
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, startColor, color);
        dfs(image, sr + 1, sc, startColor, color);
        dfs(image, sr, sc - 1, startColor, color);
        dfs(image, sr, sc + 1, startColor, color);
    }
}