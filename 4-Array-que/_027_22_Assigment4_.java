// You are given an input array whose each element represents the height of a line towers. 
// The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. 
// You need to find how much water filled between these given towers.

import java.util.Scanner;

public class _027_22_Assigment4_ {
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int leftmax = 0, rightmax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftmax >= height[left])
                    ans += leftmax - height[left];
                else
                    leftmax = height[left];

                left++;
            } else {
                if (rightmax >= height[right])
                    ans += rightmax - height[right];
                else
                    rightmax = height[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(trap(arr));
			t--;
        }
    }
}
