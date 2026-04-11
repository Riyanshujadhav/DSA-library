
import java.util.Scanner;

class Prime_Factor{

    public boolean factor(int n){
        int i;
        for (i=2; i<n; i++) {
            if(n%i==0){
                return false;
            }
        }return true;
    }
}



public class _011_primeFactorFn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Prime_Factor pf =new Prime_Factor();
        int n= sc.nextInt();
        System.out.println(pf.factor(n));

    }
}
