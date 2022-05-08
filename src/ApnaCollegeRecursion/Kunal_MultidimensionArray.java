package ApnaCollegeRecursion;
import java.util.Scanner ;
import java.util.Arrays;

public class Kunal_MultidimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Multidimension array is nothing but array of array

        // Declaration of 2D array
        // Also the size of the 2D array represent the size of row
//        int [][] arr = new int[3][2]; // No need to define number of columns

        // Declaration of Arrays
//       int [][] arr2D = {
//               {1,2,3},  // 0th index  of 2D array
//               {4,5},    // 1st Index of 2D array
//               {6,7,8}}; // 2nd Index of 2D array

        int [][] arr= new int[3][2];

        // input of arrays
        for(int row =0 ; row<arr.length;row++){
            // for each column in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        // output of arrays
//        for(int row =0 ; row<arr.length;row++){
//            // for each column in every row
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // Printing the output using only to String Method
         for(int row=0; row< arr.length;row++){
             System.out.println(Arrays.toString(arr[row]));
         }

        // Printing output of 2D arrays using enhanced for loop and toString Method
//        for(int[] num:arr){    // Here while using enhanced for loop the datatype will be an array because in multidimension array is an array of array
//            System.out.println(Arrays.toString(num));
//        }
    }
}
