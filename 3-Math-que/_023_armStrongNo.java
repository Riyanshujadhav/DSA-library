// a positive integer equal to the sum of its own digits each raised to the power of the total number of digits
//3-Digit Example 153: 1^{3}+5^{3}+3^{3}=1+125+27=153
//4-Digit Example 1634: 1^{4}+6^{4}+3^{4}+4^{4}=1+1296+81+256=1634
import java.util.Scanner;
public class _023_armStrongNo {
    public static int digit(int n){
        int digits=0;
        while (n!=0){
            digits++;
            n/=10;
        }return digits;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        int digit=digit(n);
        while (n!=0){
            int temp=n%10;
            sum=sum+(int)Math.pow(temp,digit);
            n/=10;
        }
        if(sum==num){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
