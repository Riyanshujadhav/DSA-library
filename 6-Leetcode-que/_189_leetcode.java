//import java.util.Arrays;

public class _189_leetcode {

    //optimal approach -->
        public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
//-->normal approach-->
    // public void rotate(int[] nums, int k) {
    // int n = nums.length;
    // k = k % n; 
    // if(k == 0) return; 
    // int[] temp = new int[n];
    // for(int i = 0; i < k; i++) {
    //     temp[i] = nums[n - k + i];
    // }
    // for(int i = 0; i < n - k; i++) {
    //     temp[k + i] = nums[i];
    // }
    // for(int i = 0; i < n; i++) {
    //     nums[i] = temp[i];
    // }
    // System.out.println(Arrays.toString(nums));
    // }
}
