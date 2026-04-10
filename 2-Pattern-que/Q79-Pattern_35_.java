// 1******
// 12*****
// 123****
// 1234***
// 12345**
// 123456*
// 1234567
public class Pattern_35_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
