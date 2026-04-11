public class _001_1_array {
    public static void main(String[] args) {
        // array decleration -->
        // int[] array1;  
        // int array2[];
        // array declaration & memory allocation -->
        // int [] array3=new int[5];
        // Declaration + Initialization -->
        // int[] array4 = new int[]{10, 20, 30};
        // int[] array5 = {10, 20, 30};   //   <--short-cut

        // 2️⃣ How to Print an Array?
        // 🔹 1. Using for loop (Best for Interviews)
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // 🔹 2. Using Enhanced for loop (For-each)
        // for(int value : arr){                        👉 Clean and readable
        //     System.out.println(value);               👉 Cannot access index directly
        // }
        // 🔹 3. Using Arrays.toString()
        // import java.util.Arrays;
        // System.out.println(Arrays.toString(arr));
        //
        // 🔹 4. Using Streams (Advanced)
        // Arrays.stream(arr).forEach(System.out::println);

        //3️⃣ How to Pass (Call) an Array to a Method?
        // Arrays are passed by reference (actually reference value).

        // public static void printArray(int[] arr){
        //     for(int value : arr){
        //         System.out.println(value);
        //     }
        // }
        // Calling it:
        // int[] arr = {1,2,3};
        // printArray(arr);

        // ✅ 4️⃣ How to Return an Array from a Method?
        // public static int[] createArray(){
        //     int[] arr = {5, 10, 15};
        //     return arr;
        // }
        // Calling:
        // int[] result = createArray();
        // System.out.println(Arrays.toString(result));
    }
}
