package Kunal_SortingAlgorithms;

import java.util.Arrays;
import java.util.Arrays ;

public class MergeSort_Recursion {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[]arr){
        if(arr.length==1){    // Base condition
            return arr ;
        }
        int mid = (arr.length)/2 ;   // For dividing our array into two parts for sorting

        // Two new arrays created from our original array and they will be further divided
        int []left= mergeSort(Arrays.copyOfRange(arr,0,mid));  // Last element will have index of mid-1
        int []right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); // Similarly last index arr.length-1

        // Finally merging the above two arrays after sorting
         return merge(left,right);
    }

    // New method to sort two arrays and merge them
    static int[]merge(int[] first,int [] second){
         // We need to combine both the arrays and make a new array
        int []mix=new int[first.length+second.length];
         // now we will compare elements of both the arrays and after compairing place it into new array
        int i=0;               // will be used as a pointer for first array
        int j=0;               // will be used as a pointer for second array
        int k=0;               // will be used as a pointer for mix  array

        // While compairing if the elements of any one array ends then we will write the elements of the second order
        // in that array and it will be the base condition for exit

            while(i<first.length && j<second.length){
                if(first[i]<second[j]){
                    mix[k]= first[i];
                    i++;
                }
                else{
                    mix[k]=second[j];
                    j++;
                }
                k++;
            }
            // If the elements of any one of the array is placed in mix array we need to add the remaining elements of other array

            while(i<first.length){
                mix[k]=first[i];
                i++;
                k++;         // Either one of the both while loops will be true
            }
            while(j<second.length){
            mix[k]=second[j];
            j++;
            k++ ;
        }
            return mix ;

    }


}
