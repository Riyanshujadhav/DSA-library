// Luke Skywalker gave Chewbacca an integer number x. 
// Chewbacca isn't good at numbers but he loves inverting digits in them.
// Inverting digit t means replacing it with digit 9 - t.
// Help Chewbacca to transform the initial number x to 
// the minimum possible positive number by inverting some (possibly, zero) digits.
// The decimal representation of the final number shouldn't start with a zero.
// Input Format
// The first line contains a single integer x (1 ≤ x ≤ 10^18) — 
// the number that Luke Skywalker gave to Chewbacca.
// Constraints
// x <= 100000000000000000
// Output Format
// Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. 
// The number shouldn't contain leading zeroes.
// Sample Input
// 4545
// Sample Output
// 4444
// Explanation
// There are many numbers form after inverting the digit. 
// For minimum number, check if inverting digit is less than or greater than the original digit.
//  If it is less, then invert it otherwise leave it.

import java.util.Scanner;

public class _035_11que {
    public static long rev(long n){
        long rev = 0;
        while(n!= 0){
            long temp = n % 10;
            rev = rev * 10 + temp;
            n/= 10;
        }
        return rev;
    }
	public static int count(long n){
        int count = 0;
        while(n!= 0){
            n/= 10;
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		long n=sc.nextLong();
        int l=count(n);
		long num=1;
		while(n != 0){
			long temp = n % 10;
			long inv = 9 - temp;
			if(l == 1 && temp == 9){
				num = num * 10 + temp;
			}
			else if(inv < temp){
				num = num * 10 + inv;
			}
			else{
				num = num * 10 + temp;
			}
			l--;
			n/= 10;
		}
		System.out.println(rev(num)/10);
    }
}
