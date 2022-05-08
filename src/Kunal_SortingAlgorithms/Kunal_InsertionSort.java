package Kunal_SortingAlgorithms;
import java.util.Arrays;
// In insertion sort we are dividing our array into chunks
// In first pass i.e i=0 our array will be sorted between (0,1) index values .Similarly for second pass sorted in (0,2)
// and it  will be sorted like this only
public class Kunal_InsertionSort {
    public static void main(String[] args) {
        int []arr ={5,4,3,2,1};
        arr=insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] insertionSort(int []arr){
        for(int i=0 ;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                   arr = swap(arr,j-1,j);   // Passing the index for swapping the value
                }else{
                    break ;   // If j<j-1 then simply break because our array will be sorted because of previous iterations
                }
            }
        }
        return arr ;
    }
    static int[] swap(int []arr ,int max ,int min ){
        int temp=arr[max];
        arr[max]=arr[min];
        arr[min]=temp ;
        return arr ;
    }
}
