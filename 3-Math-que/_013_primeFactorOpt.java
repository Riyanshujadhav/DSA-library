
import java.util.Scanner;

public class _013_primeFactorOpt {
    public static boolean primecheck(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(primecheck(n)){
            System.out.println("is Prime");
        }else{
            System.out.println("not a Prime No");
        }
    }
}
