// Take as input N, a number. Take N more inputs and store that in an array.
// Write a recursive function which inverses the array. Print the values of inverted array
// input = [0, 2, 4, 1, 3]
// output =[0, 3, 1, 4, 2]
import java.util.ArrayList;
import java.util.Scanner;

public class _006_01_Assigment4_ {
        public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();   
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            ans.add(0);
        }
        for (int i = 0; i < n; i++) {
            ans.set(list.get(i),i);     
        }
        for (int m : ans) {
            System.out.print(m + " ");
        }
    }
}
