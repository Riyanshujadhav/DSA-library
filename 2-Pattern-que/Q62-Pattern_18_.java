//     1 
//    2 3 
//   3 4 5 
//  4 5 6 7 
// 5 6 7 8 9 

public class Pattern_18_ {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j =i;j<=2*i-1;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
