// Take as input N, the size of array. Take N more inputs and store that in an array.
// Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.
import java.util.Arrays;
import java.util.Scanner;
public class _007_02_Assigment4_ {
    public static void trisum(int []arr,int target){
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n-2;i++){
			int left=i+1;
			int right=n-1;
			while(left<right){
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==target){
					System.out.println(arr[i] +", "+arr[left] +" and "+arr[right]);
					left++;
					right--;
				}else if(sum<target){
					left++;
				}else{
					right--;
				}
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
		trisum(arr , target);
    }
}
