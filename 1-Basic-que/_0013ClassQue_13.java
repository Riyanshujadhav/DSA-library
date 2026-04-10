import java.util.Scanner;

public class _0013ClassQue_13 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int revers_no=0;
        while(n>0){
            revers_no=revers_no*10;
            revers_no=revers_no+n%10;
            n=n/10;
        }
        System.out.println(revers_no);

    }
}
