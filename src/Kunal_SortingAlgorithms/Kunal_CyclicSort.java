package Kunal_SortingAlgorithms;
import java.util.Arrays;
public class Kunal_CyclicSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        arr =cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // For array having entries from 1 to n note that index = value-1 ---> After Sorting
    static int []cyclicSort(int []arr){
        int i=0 ;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
               arr= swap(arr,i,correctIndex);
            }
            else{
                i++ ;
            }
        }
        return arr;
    }
    static int[] swap(int []arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
}
