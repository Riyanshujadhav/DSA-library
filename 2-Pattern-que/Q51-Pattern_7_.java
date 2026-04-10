// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1
// 6 5 4 3 2 1
// 7 6 5 4 3 2 1

public class Pattern_7_ {
    public static void main(String[] args) {
       int n=7;
       for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }System.out.println();
        } 
    }
}
