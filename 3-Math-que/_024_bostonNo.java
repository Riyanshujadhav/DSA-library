// they are composite no (no who has more than 2 factor)
// sum of whosr digits is equal to the sum of digits of prime factor
import java.util.Scanner;
public class _024_bostonNo {
    public static int digitsum(int n){
        int digits=0;
        while(n!=0){
            int temp=n%10;
            digits+=temp;
            n/=10;
        }
        return digits;
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static int factorsum(int n){
        int factorsum=0;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                factorsum+=digitsum(i);
                n/=i;
            }
        }
        if(n>1){
            factorsum+=digitsum(n);
        }
        return factorsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isprime(n);
        int digitsum=digitsum(n);
        int factorsum=factorsum(n);
        if(digitsum==factorsum){
            System.out.print( "is Boston");
        }else{
            System.out.print("Not Bostan");
        }
    }
}
