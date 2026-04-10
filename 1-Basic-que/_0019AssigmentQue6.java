//Write a program that takes an integer as input and checks whether the number is strictly greater than 100.
import java.util.Scanner;
public class _0019AssigmentQue6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
