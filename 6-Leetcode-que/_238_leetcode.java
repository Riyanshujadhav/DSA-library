public class _238_leetcode {

    // optimised approcah -->
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        ans[0]=1;
        //leftproduct is stored in ans[]
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*right; // then this right product multiplied in ans{leftproduct}
            right=right*nums[i];
        }
        return ans;
    }

    // two pointer approach-->
    // public int[] productExceptSelf(int[] nums) {
    //     int n=nums.length;
    //     int []ans=new int[n];
    //     int left=1,right=n-2;
    //     //for Left product
    //     int [] leftp=new int[n];
    //     leftp[0]=1;
    //     for(int i=left;i<n;i++){
    //         leftp[i]=leftp[i-1]*nums[i-1];
    //     }
    //     int[] rightp=new int[n];
    //     rightp[n-1]=1;
    //     for(int i=right;i>=0;i--){
    //         rightp[i]=rightp[i+1]*nums[i+1];
    //     }
    //     for(int i=0;i<n;i++){
    //         ans[i]=leftp[i]*rightp[i];
    //     }
    //     return ans;
    // }

}
