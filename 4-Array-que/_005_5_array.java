
import java.util.Scanner;

public class _005_5_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no you want to find :");
        int no=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(no==arr[i]){
                System.out.println("index :"+ (i+1) );
            }
        }
    }
}
