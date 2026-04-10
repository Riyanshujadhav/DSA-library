// Write a program to calculate the bonus amount for an employee based on their years of experience.
// If the employee has 5 or more years of experience, they receive a bonus of 10% of their salary. 
// Otherwise, they receive no bonus (0).
// Input Format
// Two space-separated integers: the first is the Salary and the second is the Years of Experience.

import java.util.Scanner;

public class _0028AssigmentQue15 {  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int years= sc.nextInt();
            if (years>=5) 
                System.out.println("10 % bonus");
            else 
                System.out.println("no bonus");
    }
}
