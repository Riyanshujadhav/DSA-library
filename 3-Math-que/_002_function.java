
// using Static Calss

import java.util.Scanner;
public class _002_function {
    public static class Mathtool {
        
        public int square(int n){
            return n*n;
        }

        public void printSquare(int n){
            System.out.println(square(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        Mathtool m = new Mathtool();
        m.printSquare(a);
    }
    
}
