package ApnaCollegeRecursion;
import java.util.Arrays;

public class Kunal_ArrayElementSwap {
    public static void main(String[] args) {
        int [] arr ={ 1,2,3,4,5,6};
        swap(arr,1,4);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr ,int index_1,int index_2){
        int temp=arr[index_1];
        arr[index_1]=arr[index_2];
        arr[index_2]=temp;
    }
}
