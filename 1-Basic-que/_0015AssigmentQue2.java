//  Write a program that takes an integer as input and determines
//  whether the number is even or odd. 
//  An even number is divisible by 2, while an odd number is not.

import java.util.Scanner;

public class _0015AssigmentQue2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
