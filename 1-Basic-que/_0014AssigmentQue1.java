
    // Write a program that takes an integer as input and determines if the number is positive, negative, or zero.


    // Input Format
    // A single integer, N.


    // Constraints
    // -10^9<= N <=10^9


    // Output Format
    // Print "Positive" if the number is greater than 0.

    // Print "Negative" if the number is less than 0.

    // Print "Zero" if the number is exactly 0.
import java.util.*;

public class _0014AssigmentQue1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Zero");
        }else if( n>0){
            System.out.println("Positive");
        }else {
            System.out.println("Positive");
        }
        sc.close();
    } 
    
}
