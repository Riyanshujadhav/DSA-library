// 1
// *2*
// **3**
// ***4***
// ****5****
// *****6*****
// ******7******
public class Pattern_34_ {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n; i++) {
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }System.out.print(i);
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
