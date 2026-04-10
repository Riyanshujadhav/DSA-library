//Write a program that takes an integer as input and determines whether it is a multiple of both 3 and 7. 
// A number is a multiple of both if it is divisible by both numbers without leaving a remainder.

import java.util.Scanner;

public class _0021AssigmentQue8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%7==0)
            System.out.println("its multiple of 3 and 7");
        else
            System.out.println("its not an multiple of 3 and 7");
    }
}
