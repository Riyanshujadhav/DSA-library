// for n=5
//
//         5       4       3       2       *
//         5       4       3       *       1
//         5       4       *       2       1
//         5       *       3       2       1
//         *       4       3       2       1


public class Pattern_5_ {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j = n; j >=i+1; j--) {
                System.out.print(j+"\t");
            }System.out.print("*\t");
            for(int j=i-1;j>=1;j--){
                System.out.print(j+"\t");
            }System.out.println();
        }
    }
}
