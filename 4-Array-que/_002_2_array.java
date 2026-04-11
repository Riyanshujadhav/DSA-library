
import java.util.Scanner;

public class _002_2_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
