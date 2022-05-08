package Perpinsta_100Codes.Arrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int []arr={10, 30, 10, 20, 10, 20, 30, 10};
        freq(arr);
    }
    static void freq(int[]arr){
        int count=1 ; int element = Integer.MIN_VALUE ;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(element==arr[i]){
                    break;
                }else if (arr[j]==arr[i]){
                    count++;
                    arr[i] =element;
                }
            }
            System.out.println("Frequency of"+arr[i]+" is "+count);
        }
        return ;
    }
}
