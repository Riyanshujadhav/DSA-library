
import java.util.Scanner;


 class gcd{
    int findgcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }return a;
    }


}
public class _008_euclidean_gdcFn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        gcd gc =new gcd();
        System.out.println(gc.findgcd(a, b)); 
    }
}
