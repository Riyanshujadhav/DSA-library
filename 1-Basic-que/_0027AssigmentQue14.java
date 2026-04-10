// Write a program to calculate the total electricity bill based on the number of units consumed. 
// The pricing is structured as follows:
// For units less than or equal to 100: ₹2 per unit.
// For units greater than 100 and less than or equal to 200: ₹3 per unit.
// For units greater than 200: ₹5 per unit.

import java.util.Scanner;

public class _0027AssigmentQue14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit= sc.nextInt();
        if (unit<=100){ 
            System.out.println("2");
        }else if(unit>100&&unit<=200){
            System.out.println("3");
        }else{
            System.out.println("5");
        }   
    }
}