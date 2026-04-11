// Take sb (source number system base), db (destination number system base) and sn (number in source format).
//  Write a function that converts sn to its counterpart in destination number system. 
// Print the value returned.

// Constraints
// 0 < N <= 1000000000
// sb and db <= 10

// Sample Input
// 8
// 2 
// 33

// Sample Output
// 11011

import java.util.Scanner;

public class _039_15que {
    public static int todecimal(int sb,int sn){
		int decimal=0;
		int pow=1;
		while(sn>0){
			int temp=sn%10;
			decimal=decimal+temp*pow;
			pow=pow*sb;
			sn/=10;
		}return decimal;
	}
	public static int todb(int db,int decimal){
		int pow=1;
		int ans=0;
		while(decimal>0){
			int temp=decimal%db;
			ans=ans+temp*pow;
			pow=pow*10;
			decimal/=db;
		}return ans;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int sn=sc.nextInt();
		int decimal=todecimal(sb,sn);
		int ans= todb(db,decimal);
		System.out.println(ans);
    }
}
