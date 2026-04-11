// Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target
import java.util.Arrays;
import java.util.Scanner;

public class _009_04_Assigment4_ {
    public static void sum(int []arr,int n,int target){
		Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int sum=0;
        while (left<right){
            sum=arr[left]+arr[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else{
                System.out.println(arr[left]+" and "+arr[right]);
                right--;
                left++;
            }
        } 
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		sum(arr,n,target);
    }
}
