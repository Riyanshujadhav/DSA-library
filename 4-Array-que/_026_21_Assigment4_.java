// Given a binary number ,help Von Neuman to find out its decimal representation. 
// For eg 000111 in binary is 7 in decimal.
import java.util.Scanner;

public class _026_21_Assigment4_ {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String binary = sc.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println(decimal);
        }
    }
}
