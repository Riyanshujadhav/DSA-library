// Take as input N, the size of array. Take N more inputs and store that in an array.
// Write a function that reverses the array. Print the values in reversed array.
// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.
// 3.Reverse the elements in the Array.
// 4.Print the reversed Array.
import java.util.Scanner;
public class _014_09_Assigment4_ {
    public static void reverse(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
