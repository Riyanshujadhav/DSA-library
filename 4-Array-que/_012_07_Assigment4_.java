// Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws.
// The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n, 
// the cabs are numbered by integers from 1 to m.
// Public transport is not free. There are 4 types of tickets:
// A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
// A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
// A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
// A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.
// Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.
import java.util.Scanner;
public class _012_07_Assigment4_ {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int totalcost=0;
			int ansr=0;
			for(int i=0;i<n;i++){
			    int ride =sc.nextInt();
			    ansr=ansr+Math.min(ride*c1,c2);
			}
			ansr=Math.min(ansr,c3);
			int anscb=0;
			for(int i=0;i<m;i++){
			    int ride =sc.nextInt();
			    anscb=anscb+Math.min(ride*c1,c2);
			}
            anscb=+Math.min(anscb,c3);
            totalcost=Math.min(ansr+anscb,c4);
            System.out.println(totalcost);
		}
    }
}
