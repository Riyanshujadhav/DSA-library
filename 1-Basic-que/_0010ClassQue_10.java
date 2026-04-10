
import java.util.Scanner;

public class _0010ClassQue_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        if (n == 0 || n == 1) {
            System.out.println(result);;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(result);
        }

    }
}
