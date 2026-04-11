import java.util.Scanner;

public class _019_decimalToBinary {

    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int t=n%10;
            rev=rev*10+t;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bn=1;
        while(n>0){
            int t=n%2;
            bn=bn*10+t;
            n=n/2;
        }
        System.out.println((rev(bn))/10);
    }
}
