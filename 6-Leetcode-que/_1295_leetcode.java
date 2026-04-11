public class _1295_leetcode {
    public int findNumbers(int[] nums) {
        int number=0;
        for(int num: nums){
            int digits=0;
            while(num>0){
                digits++;
                num/=10;
            }
            if(digits%2==0){
                number++;
            }
        }return number;
    }

    // public int digits(int n){
    //     int digits=0;
    //     while(n!=0){
    //         digits++;
    //         n/=10;
    //     }return digits;
    // }
    // public int findNumbers(int[] nums) {
    //     int number=0;
    //     for(int i=0;i<nums.length;i++){
    //         int n = digits(nums[i]);
    //         if(n%2==0){
    //             number++;
    //         }
    //     }return number;
    // }
}
