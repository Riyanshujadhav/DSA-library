import java.util.*;
public class swastik {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=(n+1)/2;
            for (int i = 1; i <= m; i++) {
                for(int j=1;j<=m;j++){
                    if (j==1||j==m||i==m) {
                        System.out.print("*");
                    }else System.out.print(" ");
                }for(int j=1;j<=m;j++){
                    if(i==1||i==m){
                        System.out.print("*");
                    }else System.out.print(" ");
                }System.out.println();
            }for (int i = m-1; i >= 1; i--) {
                for(int j=1;j<=m;j++){
                    if(i==1||i==m){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                for(int j=1;j<=m;j++){
                    if (j==1||j==m||i==m) {
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.println();
            } 
    }
}
