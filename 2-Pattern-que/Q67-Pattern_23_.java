//       7 
//      7 6 
//     7 6 5 
//    7 6 5 4 
//   7 6 5 4 3 
//  7 6 5 4 3 2 
// 7 6 5 4 3 2 1 
public class Pattern_23_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j =n;j>=n-i+1;j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
}
