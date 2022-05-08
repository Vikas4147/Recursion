package Kunal_SortingAlgorithms;
import java.util.Arrays;
// Steps of Selection Sort
// S1 - Select the max element of the array
// S2 - Swap the max elemeent with the correct index

public class Kunal_SelectionSort {
    public static void main(String[] args) {
        int []arr ={3,5,1,2,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int []arr){
        // find the max element and swap with correct index
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i ; // In every pass our element will get sorted from end
            int maxIndex   =getMax(arr,0,last);
            swap(arr,maxIndex ,last);
        }
    }
    static void swap(int []arr ,int first ,int second){
        int temp= first ;
        first = second ;
        second =temp;
    }
    static int getMax(int[]arr,int start ,int end ){
        int max = start ;
        for(int i=start ;i<=end ;i++){
            if(arr[max]<arr [i]){  // Gettting the index at which max element is present
                max =i;
            }
        }
        return max ;
    }
}
