//Take the following as input.
// A number
// A digit
// Write a function that returns the number of times digit is found in the number. Print the value returned.


// Input Format
// Integer (A number) Integer (A digit)
import java.util.Scanner;

public class _026_02que {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=sc.nextInt();
		int count=0;
		while(num!=0){
			int temp=num%10;
			if(temp==digit){
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

    }
}
