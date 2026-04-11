import java.util.Arrays;

public class _283_leetcode {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
    // approach -->
    // public void moveZeroes(int[] nums) {
    //     int count=0;
    //     ArrayList<Integer>list=new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]!=0){
    //             list.add(nums[i]);
    //         }else{
    //             count++;
    //         }
    //     }
    //     while(count>0){
    //         list.add(0);
    //         count--;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = list.get(i);
    //     }
    //     System.out.println(nums);
    // }
}
