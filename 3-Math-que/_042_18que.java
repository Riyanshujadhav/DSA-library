// Take the following as input.
// A number
// Assume that for a number of n digits, the value of each digit is from 1 to n and is unique.
//  E.g. 32145 is a valid input number.
// Write a function that returns its inverse, where inverse is defined as follows
// Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543,
//  “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
// Print the value returned.
// Input Format
// Integer
// Constraints
// 0 < N < 1000000000
// Output Format
// Integer
// Sample Input
// 32145
// Sample Output
// 12543
// Explanation
// Assume that for a number of n digits, the value of each digit is from 1 to n and is unique.
//  E.g. 32145 is a valid input number. Inverse of 32145 is 12543. In 32145,
//  “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place,
//  therefore in 12543, “2” is at 4th place.

import java.util.ArrayList;
import java.util.Scanner;

public class _042_18que {
    public static ArrayList<Integer>convert(int n){
		ArrayList<Integer> num=new ArrayList<>();
		while(n!=0){
			int temp= n %10;
			num.add(temp);
			n/=10;
		}return num;
	}

    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> num =convert(n);
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i = 0; i <= num.size(); i++) {
            ans.add(0);
        }
        for(int i = 0; i < num.size(); i++) {
            ans.set(num.get(i), i + 1);
        }
        for(int i = num.size(); i >= 1; i--) {
            System.out.print(ans.get(i));
        }
    }
}
