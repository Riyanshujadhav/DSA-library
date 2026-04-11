// Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
import java.util.Scanner;
public class _015_10_Assigment4_ {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int left = 0, right = n - 1, k = n - 1;
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[k--] = nums[left] * nums[left];
                left++;
            }else {
                ans[k--] = nums[right] * nums[right];
                right--;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
