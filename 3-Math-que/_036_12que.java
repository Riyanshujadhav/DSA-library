//Given a integer as a input and replace all the '0' with '5' in the integer
import java.util.Scanner;
public class _036_12que {
    public static long replaceZero(long n) {
        if (n == 0) return 5;
        long result = 0;
        long place = 1;
        while (n > 0) {
            long digit = n % 10;
            if (digit == 0) {
                digit = 5;
            }
            result = result + digit * place;
            place *= 10;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(replaceZero(n));
    }
}
