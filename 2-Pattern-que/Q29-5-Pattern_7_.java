//
// for n=10 
//                      0 
//                    9 0 9
//                  8 9 0 9 8
//                7 8 9 0 9 8 7
//              6 7 8 9 0 9 8 7 6
//            5 6 7 8 9 0 9 8 7 6 5
//          4 5 6 7 8 9 0 9 8 7 6 5 4
//        3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
//      2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
//    1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1

public class Pattern_7_ {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=n-i+1;j<=n;j++){
                if(j==10){
                    System.out.print("0 ");
                }else{
                    System.out.print(j+" ");
                }
            }for(int j=n;j>=n-i+1;j--){
                if(j!=10){
                    System.out.print(j+" ");    
                }
            }
            System.out.println();
        }
    }
}
