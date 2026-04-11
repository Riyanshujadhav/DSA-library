public class _7_leetcode {
    public int reverse(int x) {
    double rev=0;
       while(x!=0){
        int temp=x%10;;
        rev=rev*10+temp;
        x/=10;
        }
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        if(rev>max||rev<min){
            return 0;
        }else{
            return (int)rev;
        }    
    }
}
