package Perpinsta_100Codes.Arrays;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 10};
        int max =max(arr);
        int min =min(arr);
        System.out.println("Max element is "+max+" and min element is "+min);
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
