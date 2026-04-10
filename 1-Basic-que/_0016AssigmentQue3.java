//Write a program that takes a person's age as input and determines if they are eligible to vote. 
// A person is eligible to vote if their age is 18 or greater.
import java.util.*;
public class _0016AssigmentQue3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.err.println("eligible to vote");
        }
    }
}
