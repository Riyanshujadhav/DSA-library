import java.util.Scanner;

public class _0012ClassQue_12 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
       while(n>0){
        sum=sum+n%10;
        n=n/10;
       }System.out.println(sum);

    }
}
