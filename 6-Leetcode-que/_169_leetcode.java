import java.util.Arrays;

    public class _169_leetcode {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int n=nums.length/2;
            int ans= nums[n];
            return ans;
        }
    }
// boyer moore approch -->
//     class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         int candidate = 0;
        
//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;
//             }
            
//             if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
        
//         return candidate;
//     }
// }

