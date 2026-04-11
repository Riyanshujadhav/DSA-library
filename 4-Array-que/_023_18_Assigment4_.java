//In a busy hospital emergency room, patients are triaged based on their severity levels to prioritize treatment. Each patient is assigned a severity code:
// ● 0: Non-urgent cases
// ● 1: Moderately urgent cases
// ● 2: Critical cases
//The hospital's system must efficiently sort these severity levels to ensure that critical cases are attended to first, 
// followed by moderately urgent, and finally, non-urgent cases. You are tasked with writing a function 
// that takes a list of integers representing patient severity levels and sorts it in ascending order. 
// The goal is to ensure patients are categorized by their severity efficiently.
import java.util.Arrays;
import java.util.Scanner;
public class _023_18_Assigment4_ {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
        int[] arr=new int[n];
        for (int i = 0; i < n; i++){ 
            arr[i]=scn.nextInt();
		}
        Arrays.sort(arr); 
        for (int i = 0; i < arr.length; i++){
        	System.out.println(arr[i]);
        }
    }
}
