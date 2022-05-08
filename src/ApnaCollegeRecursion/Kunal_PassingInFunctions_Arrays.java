package ApnaCollegeRecursion;
import java.util.Scanner;
import java.util.Arrays ;

public class Kunal_PassingInFunctions_Arrays {
    public static void main(String[] args) {
        int [] nums={1,3,5,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
