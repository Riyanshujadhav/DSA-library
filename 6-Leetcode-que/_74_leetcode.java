public class _74_leetcode {
    //optimal approch -->
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(target>matrix[i][j]){i++;}
            else if(target<matrix[i][j]){j--;}
        }
        return false;
    }


    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j]==target){
    //                 return true;
    //             }
    //         }
    //     }return false;
    // }
}
