// 1
// 1*3
// 1*3*5
// 1*3*5*7
// 1*3*5*7*9
// 1*3*5*7*9*11
// 1*3*5*7*9*11*13
public class Pattern_37_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {           
            for (int j = 1; j <=2*i-1; j++) {
                if(j%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }System.out.println();
        
        }
    }
}
