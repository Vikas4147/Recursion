package Kunal_Recursion.Array_Recursion;
// List down all the possible cases - Just refer notes for explaination

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,9,0,arr.length-1));

    }
    static int search(int []arr,int target ,int s,int e){
        if(s>e){              // Base Condition
            return -1;
        }
        int m= s+(e-s)/2 ;
        if(target==arr[m]){
            return m;
        }
        //Case 1
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&& target<=arr[m]){
                return search(arr,target,s,m-1);
            }else{
                return search(arr,target,m+1,e);
            }
        } // Case 2
        if(target>=arr[m]&& target<=arr[e]){
            return search(arr,target,m+1,e);
        }// Case 3
        return search(arr,target,s,m-1);
    }
}
