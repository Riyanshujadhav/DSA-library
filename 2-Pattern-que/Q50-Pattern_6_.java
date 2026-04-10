// 7 6 5 4 3 2 1 
// 7 6 5 4 3 2
// 7 6 5 4 3
// 7 6 5 4
// 7 6 5
// 7 6
// 7
public class Pattern_6_ {
    public static void main(String[] args) {
        int n=7;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}
