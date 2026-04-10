// 0000000
// 0100000
// 0020000
// 0003000
// 0000400
// 0000050
// 0000006
public class Pattern_29_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i-1; j++) {
            //     System.out.print(0);
            // }for (int j = i; j <= i; j++) {
            //     System.out.print(j-1);
            // }for (int j =n-i; j >= 1; j--) {
            //     System.out.print(0);
            // }
            // System.out.println();
            
            // second apporach -->
            for (int j = 1; j <=n; j++) {
                if(i==j){
                    System.out.print(j-1);
                }else{
                    System.out.print(0);
                }
            }System.out.println();
        }
    }
}
