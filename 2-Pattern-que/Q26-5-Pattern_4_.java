//     for n=5 
//                                    1
//                            2       3       2
//                    3       4       5       4       3
//            4       5       6       7       6       5       4
//    5       6       7       8       9       8       7       6       5




public class Pattern_4_ {
    public static void main(String[] args) {
         int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }for(int j=i;j<=2*i-1;j++){
                System.out.print(j+"\t");
            }for(int j=2*i-2;j>=i;j--){
                System.out.print(j+"\t");
            }System.out.println();
        }
    }
}
