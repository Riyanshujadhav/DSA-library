public class _918_leetcode {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currMax = nums[0];
        int minSum = nums[0];
        int currMin = nums[0];
        int total = nums[0];
        for (int i = 1; i < n; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);
            total += nums[i];
        }
        int circularSum = total - minSum;
        if (circularSum == 0) {
            return maxSum;
        }
        return Math.max(maxSum, circularSum);
    }
}
