package ApnaCollegeRecursion;

public class Kunal_MaximumElementOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,67};
        System.out.println(maxValue(arr));
    }
    static int  maxValue(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         return max;
    }
}
