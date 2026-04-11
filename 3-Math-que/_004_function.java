
import java.util.Scanner;

class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public void larger(int a,int b){
        if(a>=b)
            System.err.println(a);
        else
            System.out.println(b);
    }
    public void Welcome(){
        System.out.println("Welcome to this Calculator !");
    }
    public String end(){
        return "This is end of Calculator !";
    }
}

public class _004_function {
    public static void main(String[] args) {
        calculator calc= new calculator();
        Scanner sc=new Scanner(System.in);
        calc.Welcome();

        int a=sc.nextInt();
        int b=sc.nextInt();


       int result=calc.add(a, b);
       System.out.println(result);
       calc.larger(a, b);
       String str=calc.end();
       System.out.println(str);
    }
}
