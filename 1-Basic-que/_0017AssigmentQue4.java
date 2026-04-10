// Write a program that takes an integer as input and determines whether it is divisible by 5. 
// A number is divisible by 5 if the remainder is 0 when divided by 5.
import java.util.Scanner ;

public class _0017AssigmentQue4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0)
            System.out.println("it is divisible by 5");
        else
            System.out.println("it is not divisible by 5");

    }
}
