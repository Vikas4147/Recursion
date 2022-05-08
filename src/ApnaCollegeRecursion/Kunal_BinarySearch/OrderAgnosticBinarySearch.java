package ApnaCollegeRecursion.Kunal_BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target =-4 ;
        int ans =agnosticBinary(arr,target);
        System.out.println(ans);
    }
    // return index of target
    // return -1 if element is not found
    static int agnosticBinary(int []arr ,int target){
        int start =0; int end = arr.length-1 ;
        int mid ;
        boolean isAsc = arr[start]<arr[end] ; // To check whether array is ascending or descending
         while (start<= end){
             mid =start +(end-start)/2 ;
              // first check the common condition for both start and end
             if(target == arr[mid]){
                 return mid ;
             }
             // Making a check for ascending sorted array
             if(isAsc){   // Will execute if array is ascending sorted
                if(target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1 ;
                 }
             } else {   //  will execute if array is descending sorted
                 if(target >arr[mid]){
                     end = mid-1;
                 }else{
                     start = mid+1;
                 }
             }
         }
         return -1;

    }
}
