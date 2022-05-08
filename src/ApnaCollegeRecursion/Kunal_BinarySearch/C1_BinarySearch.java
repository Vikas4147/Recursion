package ApnaCollegeRecursion.Kunal_BinarySearch;

public class C1_BinarySearch {
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target= 50 ;
        System.out.println(binarySearch(arr,target));

    }// return index of target element
    // if target not found return  -1
    static int binarySearch(int[]arr ,int target){
        int start =0 ; int end = arr.length-1 ;
        while(start<=end){
            // finding the middle element
           // int middle = (start+end)/2 ; // this is one method to calculate the middle element or
             int mid = start +(end-start)/2 ;  // this will be useful for large size of arrays

            if(target >arr[mid]){
              start = mid+1 ;
            } else if(target <arr[mid]){
                end =mid-1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
