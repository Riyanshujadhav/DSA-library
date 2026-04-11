// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
import java.util.Scanner;

public class _029_05que{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int series=0;
        int count=0;
        int i=1;
		while(count<n1){
			series=3*i+2;
			if(series%n2!=0){
                System.out.println(series);
                count++;
            }
            i++;
            
		}
    }
}