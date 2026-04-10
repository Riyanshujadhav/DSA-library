// Write a program that takes an integer representing a month number (1 to 12) and prints the corresponding month name.

// 1: January

// 2: February

// 3: March

// 4: April

// 5: May

// 6: June

// 7: July

// 8: August

// 9: September

// 10: October

// 11: November

// 12: December

import java.util.Scanner;

public class _0026AssigmentQue13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String year = switch(n){
            case 1-> "january";
            case 2-> "february";
            case 3-> "march";
            case 4-> "april";
            case 5-> "may";
            case 6-> "june";
            case 7-> "july";
            case 8-> "august";
            case 9-> "september";
            case 10-> "october";
            case 11-> "november";
            case 12-> "december";
            default-> "enter a right one";
        };
        System.out.println(year);
    }
}
