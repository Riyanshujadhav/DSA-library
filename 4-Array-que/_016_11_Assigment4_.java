//Sort just 0 and 1
// Input Format
// A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
import java.util.Scanner;
public class _016_11_Assigment4_ {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countZero = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                countZero++;
            }
        }
        for(int i = 0; i < countZero; i++){
            System.out.print("0 ");
        }
        for(int i = countZero; i < n; i++){
            System.out.print("1 ");
        }
    }
}
