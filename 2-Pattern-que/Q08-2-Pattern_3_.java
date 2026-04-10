
//   for  n=5
//
//        * * * * * * * * * 
//          * * * * * * *
//            * * * * *
//              * * *
//                *



public class Pattern_3_ {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
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
