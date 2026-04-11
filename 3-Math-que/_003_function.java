
import java.util.Scanner;

class Mathtool{
    public int square(int n){
        return n*n;
    }
    public void printsq(int n){
        System.out.println(square(n));
    }
}
class max{
    public int maxno(int a ,int b){
        if(a>=b){
            return a;
        }else
            return b;
    }
    public int maxno(int a ,int b,int c){
        if(a>=b){
            if(a>=c){
                return a;
            }else 
                return c;    
        }
        else if (b>=c){
            return b;
        }else 
            return c;
    }
}

public class _003_function {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Mathtool sq =new Mathtool();
        max m= new max();
        sq.printsq(n);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=m.maxno(a, b, c);
        System.out.println(result);
   } 
}
