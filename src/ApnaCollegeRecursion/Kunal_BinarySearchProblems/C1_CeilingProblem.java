package ApnaCollegeRecursion.Kunal_BinarySearchProblems;
// Ceiling value = Smallest value greater than or equal to target
// Using the logic of binary search and note that when the condition of whilw loop violate
// case will be  start > end and before start our middle element will be present and hence we will return start

public class C1_CeilingProblem {
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target =46;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
 // return the index
    // return -1 if no smallest element is greater than or equal to target
    static int ceiling(int [] arr ,int target){
        int start =0 ; int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2 ;
            if(target >arr[mid]){
                start =mid+1;
            } else if (target<arr[mid]){
                end = mid-1;
            }else{
                return mid ;
            }

        }if(start>arr.length-1){  // Check if target element is greater than the greatest element
            return -1;
        }
        return start ;  // Will be ture for ascending sorted array

    }
}
