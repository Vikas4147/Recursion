package Kunal_Recursion.PatternAndSorting;
import java.util.Arrays ;

public class BubbleSort_recursion {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        int col=0 ;int row= arr.length-1;
        sort(arr,row,col);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int []arr,int row,int col){
        if(row==0){       // Base condition
            return ;
        }
        if(col<row){      // This will take care in each pass all the elements of the array are compared
            if(arr[col+1]<arr[col]){     // Take care of swapping of elements
                // swap
                int temp= arr[col+1];
                arr[col+1]=arr[col];
                arr[col]=temp ;
            }
            sort(arr,row,col+1);    // After swapping two neighbouring elements comparing next two elements
        }
        else {       // Changing outer pass
            sort(arr,row-1,0);
        }
    }
}
