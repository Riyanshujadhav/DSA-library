// Given an array arr of n integers where n > 1, return an array output such that output[i] 
// is equal to the product of all the elements of arr except arr[i].
// Challenge : do this without division in linear time
import java.util.Scanner;
public class _024_19_Assigment4_ {
    public static void productExceptSelf(int[] arr,int n){
        long[] output= new long[n];
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=output[i-1]*arr[i-1];
        }
        long right = 1;
        for(int i = n-1; i >= 0; i--) {
            output[i] = output[i] * right;
            right = right * arr[i];
        }
        for(int i=0;i<n;i++){
        System.out.print(output[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        productExceptSelf(arr, n);
    }
}
