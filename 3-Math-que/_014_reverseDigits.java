import java.util.Scanner;

class ReversNo{
    
    int rev(int n){
        int reverse=0;
        while(n!=0){
            int t=n%10;
            reverse=reverse*10+t;
            n/=10;
        }
        return reverse;
    }
}
public class _014_reverseDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReversNo rv=new ReversNo();
        System.out.println(rv.rev(n));
    }
}
