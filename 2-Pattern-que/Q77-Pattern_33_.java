// 1
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15
public class Pattern_33_ {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                int value=num+i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(value+" ");
                    value--;
                    num++;
                }
            }else
            {
                for (int j = 1; j <= i; j++) 
                {
                    System.out.print(num+" ");
                     
                    num++;
                }
            }System.out.println();
        }

    }
}
