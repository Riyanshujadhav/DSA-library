// Deepak has a limited amount of money that he can spend on his girlfriend.
// So he decides to buy two roses for her. Since roses are of varying sizes, their prices are different. 
// Deepak wishes to completely spend that fixed amount of money on buying roses for her.
// As he wishes to spend all the money, he should choose a pair of roses whose prices
//  when summed up are equal to the money that he has.
// Help Deepak choose such a pair of roses for his girlfriend.
// NOTE: If there are multiple solutions print the solution that minimizes the difference 
// between the prices i and j. After each test case, you must print a blank line
// (test case: 2)
// 2                 5
// 40 40             10 2 6 8 4 
// 80  (ans 40,40)   10(ans 4,6)


import java.util.Arrays;
import java.util.Scanner;
public class _011_06_Assigment4_ {
    public static void solve(int[] arr, int n, int money) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int ans1 = 0;
        int ans2 = 0;
        int minDiff = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == money) {
                if (arr[right] - arr[left] < minDiff) {
                    minDiff = arr[right] - arr[left];
                    ans1 = arr[left];
                    ans2 = arr[right];
                }
                left++;
                right--;
            } 
            else if (sum < money) {
                left++;
            } 
            else {
                right--;
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + ans1 + " and " + ans2 + ".");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            solve(arr, N, M);
			T--;
        }
    }

    // Methord 2nd -->

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int t=sc.nextInt();
    //     while(t-->0){
    //         int n=sc.nextInt();
    //         int []arr=new int[n];
    //         for(int i=0;i<n;i++){
    //             arr[i]=sc.nextInt();
    //         }
    //         int target=sc.nextInt();
    //         Arrays.sort(arr);
    //         int left=0;
    //         int right=n-1;
    //         int ans1=0;
    //         int ans2=0;
    //         int mindiff=Integer.MAX_VALUE;
    //         while(left<right){
    //             int sum=arr[left]+arr[right];
    //             if(sum<target){
    //                 left++;
    //             }else if(sum>target){
    //                 right--;
    //             }else{
    //                 if(arr[right]-arr[left]<mindiff){
    //                     mindiff=arr[left]+arr[right];
    //                     ans1=arr[left];
    //                     ans2=arr[right];
    //                 }
    //                 left++;
    //                 right--;
    //             }
    //         }
    //         System.out.println("Deepak should buy roses whose prices are " + ans1 + " and " + ans2 + ".");
    //     }  
    // }
}
