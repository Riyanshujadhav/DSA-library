import java.util.ArrayList;

public class _4_leetcode {
    public static ArrayList<Integer> merge(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                nums.add(nums1[i]);
                i++;
            }else{
                nums.add(nums2[j]);
                j++;
            }
        }
        while (i < n) {
            nums.add(nums1[i]);
            i++;
        }
        while (j < m) {
            nums.add(nums2[j]);
            j++;
        }
        return nums;
    }    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = merge(nums1, nums2);
        int s = nums.size();
        double median;
        if (s % 2 != 0) {
            int mid = s / 2;
            median = nums.get(mid);
        } else {
            int mid1 = s / 2;
            int mid2 = (s / 2) - 1;
            median = (nums.get(mid1) + nums.get(mid2)) / 2.0;
        }
        return median;
    }
     
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     double median=0;
    //     ArrayList<Integer> arr=new ArrayList<>();
    //     for(int i=0;i<nums1.length;i++){
    //         arr.add(nums1[i]);
    //     }
    //     for(int j=0;j<nums2.length;j++){
    //         arr.add(nums2[j]);   
    //     }
    //     Collections.sort(arr);
    //     int s=arr.size();
    //     if(s%2==0){
    //         median=(double)(arr.get(s/2)+arr.get((s/2)-1))/2;
    //     }else{
    //         median=arr.get(s/2);
    //     }
    //     return median;
    // }
}
