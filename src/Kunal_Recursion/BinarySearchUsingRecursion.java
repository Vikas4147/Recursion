package Kunal_Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int []arr={1,2,3,5,66,78};
        int target = 73;
       int ans= search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    // Mid value is updated in every recursion calls hence start and end are passed into the arguements
    static int search(int []arr,int target,int start ,int end ){
        if(start>end){           // Base condition
            return -1 ;
        }
        int mid = start + (end-start)/2 ;
        if(arr[mid]==target){
            return mid ;
        }
        if(target>arr[mid]){
            return search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);

    }
}
