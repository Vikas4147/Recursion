package Perpinsta_100Codes.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        System.out.println("Enter the position of elemnt to print after sorting  :");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int[] arr = {12, 13, 1, 10, 34, 10};
        arr = element(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Elemnt at "+position+" position is "+arr[position-1]);
    }
    static int[] element (int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }
}

