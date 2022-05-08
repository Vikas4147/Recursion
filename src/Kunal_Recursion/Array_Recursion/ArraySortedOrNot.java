package Kunal_Recursion.Array_Recursion;
// Check whether array is sorted or not using recursion

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int []arr={1,2,8,10,9,12};
        if(sorted(arr,1)){
            System.out.println("Sorted ");
        }
        else{
            System.out.println("Not sorted ");
        }

    }
    static boolean sorted(int []arr,int target){
        if(target==arr.length-1){   // Base condition
            return true;
        }
        return (arr[target]>arr[target-1]) && sorted(arr,target+1);

    }

}
