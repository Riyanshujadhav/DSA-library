//Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the GCD of N1 and N2. Print the value returned.
import java.util.Scanner;

public class _034_10que {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        System.out.println(a);
    }
}
