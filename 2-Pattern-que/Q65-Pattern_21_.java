//       7 
//      6 7 
//     5 6 7 
//    4 5 6 7 
//   3 4 5 6 7 
//  2 3 4 5 6 7 
// 1 2 3 4 5 6 7 

public class Pattern_21_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j =n-i+1;j<=n;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
}
