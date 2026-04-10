// Write a program that takes the lengths of the three sides of a triangle and determines its type:

// Equilateral: All three sides are equal.

// Isosceles: Exactly two sides are equal.

// Scalene: All three sides are different.

import java.util.Scanner;

public class _0029AssigmentQue16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b&&b==c){
            System.out.println("equilateral");
        }else if(a==b&&b!=c||b==c&&a!=b){
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}
