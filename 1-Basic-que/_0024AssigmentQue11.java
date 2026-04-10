// Write a program that takes a student's marks as input and assigns a grade based on the following criteria:

// Marks greater than or equal to 90: Grade A

// Marks greater than or equal to 75 and less than 90: Grade B

// Marks greater than or equal to 60 and less than 75: Grade C

// Marks less than 60: Fail

import java.util.Scanner;

public class _0024AssigmentQue11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grade= sc.nextInt();
        if (grade>=90) {
            System.out.println("A");
        } else if (grade>=75) {
            System.out.println("B");
        } else if (grade>=60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

    }
}
