package Perpinsta_100Codes.Arrays;
import java.util.Arrays;

// Logic - First Sort the Array and then with respect to the middle element take the reverse of second half of array

public class FirstHalf_AscSecHalf_Des {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        arr=sort(arr);
        arr=revSecHalf(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Sorting the array using bubble sort
    static int[]sort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    // Reversing the second half of the ascending sorted array
    static int[]revSecHalf(int []arr) {
        int n = arr.length;int count =0;
        for (int i =n/2; i <(3*n)/4; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-count];
            arr[n-1-count] = temp;
            count++;
        }
        return arr;
    }

}

