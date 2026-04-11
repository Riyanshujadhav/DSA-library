//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
import java.util.*;
public class _033_09que {

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
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
