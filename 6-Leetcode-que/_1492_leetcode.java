import java.util.Scanner;
    public class _1492_leetcode {
        public int kthFactor(int n, int k) {
        Scanner sc=new Scanner(System.in) ;
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
                if(cnt==k){
                return i;
                }
            }
        } 
        return -1;  
    }
}
