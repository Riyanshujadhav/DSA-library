// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
import java.util.Scanner;
public class _038_14que {
    public static boolean isarmstrong(int n){
		int no=n;
		int sum=0;
		int digit=0;
		int temp=n;
		while(temp!=0){
			digit++;
			temp/=10;
		}
		temp=n;
		while(temp!=0){
			int t=temp%10;
			sum=sum+(int)Math.pow(t,digit);
			temp/=10;
		}
		return no==sum;
	}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++){
			if(isarmstrong(i)){
				System.out.println(i);
			}
		}
    }
}
