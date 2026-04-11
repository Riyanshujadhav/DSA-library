//Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
import java.util.Scanner;

public class _028_04que {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dn=0;
        int count=0;
        while(n!=0){
            int t=n%10;
            dn=dn+t*(int)Math.pow(2, count);
            n=n/10;
            count++;
        }
        System.out.println(dn);
    }
}
