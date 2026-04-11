
import java.util.ArrayList;
import java.util.Scanner;

public class _002_ {
    public static void main(String[] args) {
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
        System.out.println(ans);
        
    }
}
