// Given an array of size n, find the majority element. 
// The majority element is the element that appears more than n/2 times.
//You may assume that the array is non-empty and the majority element always exist in the array

import java.util.Arrays;
import java.util.Scanner;

public class _028_23_Assigment4_ {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
		System.out.print(arr[n/2]);
    }
}
