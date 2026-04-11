// Given an array nums of length n. We define a running sum of an array 
// as for every index runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of array for each i (0 <= i < n).

import java.util.Scanner;

public class _025_20_Assigment4_ {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            System.out.print(sum + " ");
        }
   } 
}
