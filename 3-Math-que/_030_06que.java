// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned
import  java.util.*;
public class _030_06que {
   public static int gcd(int n1, int n2){
		while(n2!=0){
			int temp=n1%n2;
			n1=n2;
			n2=temp;
		}return n1;
	}


    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=gcd(n1,n2);
		int lcm =(n1*n2)/gcd;
		System.out.println(lcm);
		
    }
}
