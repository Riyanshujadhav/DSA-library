
import java.util.Scanner;

//Write a program to determine if a given year is a leap year. A year is a leap year if:

//It is divisible by 400, OR

//It is divisible by 4 but not divisible by 100.
public class _0020AssigmentQue7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0||n%4==0&&n%100!=0)
            System.out.println("its an leep year");
        else
            System.out.println("not an leep yesr");
    }
}
