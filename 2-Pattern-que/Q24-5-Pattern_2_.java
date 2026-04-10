// for n=5
//                                     1
//                             2       3       4
//                     5       6       7       8       9
//             10      11      12      13      14      15      16
//     17      18      19      20      21      22      23      24      25



public class Pattern_2_ {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print(k+"\t");
                k++;
            }System.out.println();
        }
    }
}
