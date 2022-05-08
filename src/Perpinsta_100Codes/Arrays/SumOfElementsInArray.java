package Perpinsta_100Codes.Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 10};
        int ans = sum(arr);
        System.out.println(ans);
    }
    static int sum(int []arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum ;
    }

}
