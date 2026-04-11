
import java.util.Scanner;

public class _003_3_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
