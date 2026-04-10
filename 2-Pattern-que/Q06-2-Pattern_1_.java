//
//   n=5
//
//      *   *   *   *   *
//              *   *   *   *
//                      *   *   *    
//                              *   *
//                                      *


// My Code -->

public class Pattern_1_ {
    public static void main(String[] args) {
        int n=5;
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=2*(i-1);j++){
                System.out.print("    ");
            }for(int j=n-i+1;j>=1;j--){
                System.out.print("*   ");
            }System.out.println();
        }
    }
}

// Sir Code -->

//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=2*i-2;j++){
//             cout<<"  ";
//         }
//         for(int j=1;j<=n-i+1;j++){      <-- here sir has taken j<=n-i+1 
//             cout<<"* ";
//         }
//         cout<<endl;
//  