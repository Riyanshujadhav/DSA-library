// Take the following as input.

// A number
// Write a function which returns true if the number is an armstrong number 
// and false otherwise, where Armstrong number is defined as follows.

// A positive integer of n digits is called an 
// Armstrong number of order n (order is number of digits) if.

// abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

// 1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

// Input Format
// Single line input containing an integer

// Constraints
// 0 < N < 1000000000

// Output Format
// Print boolean output for each testcase.
// "true" if the given number is an Armstrong Number, else print "false".

import java.util.Scanner;
public class _044_20que {
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
		if(no==sum){
			return true;
		}else return false;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=isarmstrong(n);
		System.out.println(b);

    } 
}
