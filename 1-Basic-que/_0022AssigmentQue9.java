// Write a program that takes two integers as input and checks whether they are equal to each other or not.


// Input Format
// A single line containing two space-separated integers, $A$ and $B$.

import java.util.Scanner;

public class _0022AssigmentQue9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n==m)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}
