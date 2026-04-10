// Write a program that takes an integer representing a day number (1 to 7) and prints the corresponding day name. Assume the week starts with Monday.

// 1: Monday

// 2: Tuesday

// 3: Wednesday

// 4: Thursday

// 5: Friday

// 6: Saturday

// 7: Sunday

import java.util.Scanner;

public class _0025AssigmentQue12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String day = switch(n){
            case 1-> "monday";
            case 2-> "tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            default-> "enter a right one";
        };
        System.out.println(day);
    }
    
}
