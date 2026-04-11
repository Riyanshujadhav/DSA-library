public class _498_leetcode {
    public int[] findDiagonalOrder(int[][] mat) {
       int m = mat.length;
        int n = mat[0].length;

        boolean up = true;
        int r = 0, c = 0;
        int i = 0;

        int[] ans = new int[m * n];

        while (r < m && c < n) {

            if (up) {
                // moving up-right
                while (r > 0 && c < n - 1) {
                    ans[i++] = mat[r][c];
                    r--;
                    c++;
                }

                ans[i++] = mat[r][c];

                if (c == n - 1) {
                    r++;
                } else {
                    c++;
                }

            } else {
                // moving down-left
                while (c > 0 && r < m - 1) {
                    ans[i++] = mat[r][c];
                    r++;
                    c--;
                }

                ans[i++] = mat[r][c];

                if (r == m - 1) {
                    c++;
                } else {
                    r++;
                }
            }

            up = !up;
        }

        return ans;
    }
}
