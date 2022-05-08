package Perpinsta_100Codes.Arrays;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 10};
        System.out.println(Arrays.toString(arr));
        arr= rev(arr);
        System.out.println("Reverse is "+Arrays.toString(arr));
    }
    static int []rev(int []arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
}
