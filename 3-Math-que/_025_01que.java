//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
import java.util.Scanner;

public class _025_01que {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int oddsum=0;
		int evensum=0;
		int count=1;
		while(n!=0){
			int temp=n%10;
			if(count%2!=0){
				oddsum=oddsum+temp;
			}else{
				evensum=evensum+temp;
			}
			n=n/10;
			count++;
		}
		System.out.println(oddsum);
		System.out.println(evensum);

    }
}
