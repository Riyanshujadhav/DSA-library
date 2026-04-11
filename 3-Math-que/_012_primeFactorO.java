
import java.util.Scanner;

public class _012_primeFactorO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("not a Prime No");
                break;
            }else{
                System.err.println("is a Prime No");
                break;
            }
        }
        
    }
}
