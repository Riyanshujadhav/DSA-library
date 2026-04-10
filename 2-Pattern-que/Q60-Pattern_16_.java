// 1234567
//  234567
//   34567
//    4567
//     567
//      67
//       7
//      67
//     567
//    4567
//   34567
//  234567
// 1234567
public class Pattern_16_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for(int j =2;j<=i;j++){
                System.out.print(" ");
            }
            for (int j =i;j<=n;j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }for (int i = n-1; i >= 1; i--) {
            for(int j =2;j<=i;j++){
                System.out.print(" ");
            }
            for (int j =i;j<=n;j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}
