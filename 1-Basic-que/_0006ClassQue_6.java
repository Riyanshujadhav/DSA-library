import java.util.Scanner;

public class _0006ClassQue_6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grade= sc.nextInt();
        if (grade>90) {
            System.out.println("A");
        } else if (grade>75) {
            System.out.println("B");
        } else if (grade>60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

    }
}
