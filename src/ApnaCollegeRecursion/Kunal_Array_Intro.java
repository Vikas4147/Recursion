package ApnaCollegeRecursion;
import java.util.Scanner  ;
import java.util.Arrays ;

public class Kunal_Array_Intro {
    public static void main(String[] args) {
        // used to store collection of same data
           Scanner sc = new Scanner(System.in);
        // Syntax : datatype[] variable = new Int[length]
//        int [] arr = new int [5];
        // input using for loops
//        for(int i=0;i<5;i++){
//            arr[i] = sc.nextInt();
//        }

        // Print arrays using for Loops
//        for(int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }

        // Print using enhanced for loop
//        for(int num:arr){
//            System.out.print(num+" "); // Here num represents each element of an array
//        }

        // Printing the array using to String -- It simply converts the array into string
//        System.out.println(Arrays.toString(arr));

        // Arrays of Objects
        String []str = new String[4];
        // Assigning values
        for(int i=0;i<str.length;i++){
            str[i]= sc.next();
        }

        // Printing values of array
        System.out.println(Arrays.toString(str));

        // Arrays are mutable
        // modifying element of array
        str[1]= "Vikas ";
        System.out.println(Arrays.toString(str));




    }
}
