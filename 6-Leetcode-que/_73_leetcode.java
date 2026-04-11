public class _73_leetcode {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                  row[i]=true;
                  col[j]=true; 
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }

    //     public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int[][] ans = new int[m][n];
    //     for(int i = 0; i < m; i++){                  // fill ans with 1
    //         for(int j = 0; j < n; j++){
    //             ans[i][j] = 1;
    //         }
    //     }
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] == 0){
    //                 for(int k = 0; k < n; k++){      // make row zero
    //                     ans[i][k] = 0;
    //                 }
    //                 for(int k = 0; k < m; k++){      // make column zero
    //                     ans[k][j] = 0;
    //                 }
    //             }
    //         }
    //     }
    //     for(int i = 0; i < m; i++){                  // update original matrix
    //         for(int j = 0; j < n; j++){
    //             if(ans[i][j] == 0){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }
}
