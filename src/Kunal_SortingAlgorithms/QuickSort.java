package Kunal_SortingAlgorithms;
import java .util.Arrays ;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr= {1,4,5,3,2,};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int []arr,int low ,int high ){
        // Base condition
        if(low>=high){
            return ;
        }

        int start =low ;
        int end = high;
        int mid= start+(end-start)/2 ;
        int pivot = arr[mid];

        while (start<=end) {   // This represnts  the condition upto which our pivot element comes to correct position
            // Condition for checking if elements on left of pivot are samller or not
            while (arr[start] < pivot) {
                start++;
            }
            // Condition for checking if elements on righ of pivot are greater or not
            while (arr[end] > pivot) {
                end--;
            }
            // if both the above condition fails the means on left side greater elements are present and on right smaller
            // elements are present hence the should be swapped
            if (start <= end) {
                // Swapping of elements
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // After the pivot element is in correct position we have to smaller arrays
        sort(arr,low,end);     // Same procedure for left array
        sort(arr,start,high);   // Same procedure for right array

    }

}
