package ApnaCollegeRecursion.Kunal_BinarySearchProblems;
// Q: The sorted array has infinite length hence we can't use arr.length function and without using it we need to find position of element
// In binary search the total steps required was logN where we were dividing our array into groups of 2
// In this sum we are following reverse approach of that  are increasing size of array by 2 hence in this also we will require logN steps
public class PositionOfElementInSortedArray {
    public static void main(String[] args) {
        int []arr ={3,5,7,9,10,90,100,130,140,160,170};
        int target =10;
        System.out.println(ans(arr,target));

    }// This block of code will help to find out the range in which our target element lies
    static int ans(int []arr,int target){
        // first find the range of in which target lies
        // initialize the box size as 2

        int start =0;
        int end =1 ;
        // If this condition is true then target doesnt lies in the given range hence we will double the range
        while (target > arr[end]){
            int temp = end+1;  // This will be my new start
             // double the box value
            // formula: new end = end+ (size of box)*2
            end =end+(end-start+1)*2 ;
            start = temp;

        }
       return binarySearch(arr ,start,end,target) ;

    }// This will return the index of the target element
    static int binarySearch(int[]arr,int start, int end,int target){
        while (start<= end){
            int mid =start+(end -start)/2 ;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
