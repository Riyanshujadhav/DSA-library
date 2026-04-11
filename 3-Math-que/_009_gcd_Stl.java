
import java.math.BigInteger;
import java.util.Scanner;



public class _009_gcd_Stl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        BigInteger num1=BigInteger.valueOf(a);
        BigInteger num2=BigInteger.valueOf(b);
        BigInteger g =num1.gcd(num2);
        System.out.println("GCD using BigInteger is :"+g);
    }
}
