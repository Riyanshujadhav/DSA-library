public class _566_leetcode {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;        
        int m = mat[0].length;  
        if (n * m != r * c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[x][y] = mat[i][j];
                y++;
                if (y == c) {
                    x++;
                    y = 0;
                }
            }
        }
        return ans;
    }
}
