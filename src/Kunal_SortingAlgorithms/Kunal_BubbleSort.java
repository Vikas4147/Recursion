package Kunal_SortingAlgorithms;
import java.util.Arrays;

public class Kunal_BubbleSort {
    public static void main(String[] args) {
        boolean swapped= false ;  // This will be used to check whether array is sorted or not
        int []arr={5,4,3,2,1};
        // Outer loop will run n-1 times
        for(int i=0 ;i<arr.length;i++){
             // In this j will start from 1 and it will compare the consecutive elements
         // Note for a particular pass i.e particular value of i if j does not swap then array is sorted
            for(int j=1;j<= arr.length-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true ;
                }
            }
            if(!swapped){ // not false is true
                break ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
