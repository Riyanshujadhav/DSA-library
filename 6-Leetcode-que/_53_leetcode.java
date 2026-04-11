public class _53_leetcode {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
           currentsum+=nums[i];
           if(currentsum>maxsum){
            maxsum=currentsum;
           }
           if(currentsum<0){
            currentsum=0;
           }
        }
        return maxsum;
    }
}
