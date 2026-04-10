//
//  for n=5
//           *                       * 
//           *  *                 *  *
//           *  *  *           *  *  *
//           *  *  *  *     *  *  *  *
//           *  *  *  *  *  *  *  *  *




public class Pattern_4_ {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("   ");
            }if(i!=n){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
        }else{
            for (int j = 2; j <=i; j++) {
                System.out.print(" * ");
            }
        }
            System.out.println();
        }
    }
}
