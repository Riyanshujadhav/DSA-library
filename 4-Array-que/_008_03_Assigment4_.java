// Take as input N, the size of an array. Take N more inputs and store that in an array.
// Take another number’s input as M. Write a function which returns the index on which M is found 
// in an array, in case M is not found -1 is returned. Print the value returned.
import java.util.Scanner;
public class _008_03_Assigment4_ {
    public static int findIndex(int []arr,int m){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == m) {
                return i;
            }
        }
        return -1;
	}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		int m = sc.nextInt();
        System.out.println(findIndex(arr, m));
    }
}
