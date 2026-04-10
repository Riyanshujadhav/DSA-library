
//      for n=5
//               *                     * * 
//             * * *                 * * * *
//           * * * * *             * * * * * *
//         * * * * * * *         * * * * * * * *
//       * * * * * * * * *     * * * * * * * * * *
//          asymmetric         for symmetric one
public class Pattern_2_ {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }for(int j=1;j<=i;j++){
                System.out.print("* ");
            }for(int j=1;j<=i-1;j++){           //   just do j<=i
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
